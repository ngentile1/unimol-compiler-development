grammar Alan2;

@header{
package it.unimol.alan2;

import it.unimol.alan2.TooLongIDException;
}

source
    : SOURCE ID def* body
    ;

param: type ID;

params
    : (param (COMMA param)*)
    ;

return_type
    : (TO type)
    ;

funcdef
    : FUNCTION ID OPENPAR params? CLOSEPAR return_type? body
    ;

body
    : BEGIN def* statements END
    ;

native_type: INT | BOOL;

type
    : native_type ARRAY?
    ;

def 
    : vardef
    | funcdef SEMI
    ;

vardef
    : type ID (COMMA ID)* SEMI
    ;

statements
    : RELAX
    | statement (SEMI statement)*
    ;

statement
    : assign
    | call
    | if
    | input
    | leave
    | output
    | while
    ;

array_access
    : ID OPENBRA simple CLOSEBRA
    ;

left_operand: array_access | id;

array_simple: ARRAY simple;

right_operand: expr | array_simple;

assign
    : left_operand ASSIGNMENT right_operand
    ;

function_call: ID OPENPAR (expr (COMMA expr)*)? CLOSEPAR;

call
    : CALL function_call
    ;

condition: expr;

if
    : IF condition THEN statements elsif* else? END
    ;

elsif
    : ELSIF condition THEN statements
    ;

else
    : ELSE statements
    ;

input
    : GET left_operand
    ;

leave
    : LEAVE expr?
    ;

output
    : PUT (STRING | expr) (DOT (STRING|expr))*
    ;

while
    : WHILE condition DO statements END
    ;

eq_op: EQ | NE;


eq_cmp_simples: simple eq_op simple;

diseq_op : GE|GT|LE|LT;

diseq_cmp_simples: simple diseq_op simple;

cmp_simples
    : eq_cmp_simples
    | diseq_cmp_simples
    ;

expr
    : simple 
    | cmp_simples
    ;

simple_tail
    : simple_or_tail
    | simple_alg_tail
    ;

simple_or_tail
    : OR term
    ;

simple_alg_op: PLUS | MINUS;

simple_alg_tail
    : simple_alg_op term
    ;

simple
    : MINUS? term simple_tail*
    ;

term_and_tail
    : AND factor
    ;

term_alg_op: MUL|DIV|REM;

term_alg_tail
    : term_alg_op factor
    ;

term_tail
    : term_and_tail
    | term_alg_tail
    ;

term
    : factor term_tail*
    ;

par_expr: OPENPAR expr CLOSEPAR;

negate_factor: NOT factor;

id: ID;
num: NUM;
bool_const: TRUE|FALSE;

factor
    : array_access
    | function_call
    | id
    | par_expr
    | num
    | negate_factor
    | bool_const
    ;

SOURCE: 'source' ;
FUNCTION: 'function';
OPENPAR: '(';
CLOSEPAR: ')';
COMMA: ',';
TO: 'to';
BEGIN: 'begin';
END: 'end';
BOOL: 'boolean';
INT: 'integer';
ARRAY: 'array';
SEMI: ';';
RELAX: 'relax';
OPENBRA: '[';
CLOSEBRA: ']';
ASSIGNMENT: ':=';
CALL: 'call';
IF: 'if';
THEN: 'then';
ELSIF: 'elsif';
ELSE: 'else';
GET: 'get';
LEAVE: 'leave';
PUT: 'put';
DOT: '.';
WHILE: 'while';
DO: 'do';
EQ: '=';
GE: '>=';
GT: '>';
LE: '<=';
LT: '<';
NE: '<>';
MINUS: '-';
PLUS: '+';
OR: 'or';
AND: 'and';
DIV: '/';
MUL: '*';
REM: 'rem';
NOT: 'not';
TRUE: 'true';
FALSE: 'false';

fragment DIGIT 
    : ( '0'..'9' ) 
    ;

fragment LETTER 
    : ( 'a'..'z' | 'A'..'Z' | '_' ) 
    ;

ID 
    : LETTER (LETTER|DIGIT)*  { if(getText().length() > 32) throw new TooLongIDException("Identifier must at most 32 character: " + getText()); }
    ;

NUM 
    : DIGIT DIGIT*
    ;

fragment ESCAPE_CHAR
    : '\\'
    | '"'
    | 'n'
    | 't'
    ;

fragment PRINTABLE_CHAR
    : ('\\' ESCAPE_CHAR)
    | ('\u0020'..'\u0021'|'\u0023'..'\u005b'|'\u005d'..'\u007E') //excluding " and \
    ;

STRING 
    : '"' PRINTABLE_CHAR* '"'
    ;

fragment COMMENT_TEXT
    : (~'{')+
    ;

COMMENT
    : '{' COMMENT_TEXT? COMMENT? COMMENT_TEXT? '}' -> skip
    ;

WS: [ \n\t\r]+ -> skip;

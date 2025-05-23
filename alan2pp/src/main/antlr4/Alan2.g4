grammar Alan2;

@header{
package it.unimol.alan2pp;

import it.unimol.alan2pp.TooLongIDException;
}

source
    : SOURCE ID def* body
    ;

param: type ID;

param_comma: param COMMA;

params
    : param_comma* param
    ;

return_type: TO type;

funcdef
    : FUNCTION ID OPENPAR params? CLOSEPAR return_type? body
    ;

body
    : BEGIN def* statements END
    ;

type
    : (INT | BOOL) ARRAY?
    ;

id_comma: ID COMMA;

def 
    : type id_comma* ID SEMI
    | funcdef SEMI
    ;

vardef
    : type (ID COMMA)* ID SEMI
    ;

statements
    : RELAX
    | statement (SEMI statement)*
    ;

statement
    : assign
    | CALL function_call
    | if
    | input
    | leave
    | output
    | while
    ;

array_access_begin: ID OPENBRA;

array_access
    : array_access_begin simple CLOSEBRA
    ;

array_simple: ARRAY simple;

assign
    : (array_access | ID) ASSIGNMENT (expr | array_simple)
    ;

expr_comma: expr COMMA;

function_call_begin: ID OPENPAR;

function_call: function_call_begin ((expr_comma)* expr)? CLOSEPAR;

if
    : IF expr THEN statements elsif* else? END
    ;

elsif
    : ELSIF expr THEN statements
    ;

else
    : ELSE statements
    ;

input
    : GET (array_access | ID)
    ;

leave
    : LEAVE expr?
    ;

put_expr_dot: (STRING|expr) DOT;

output
    : PUT put_expr_dot* (STRING|expr)
    ;

while
    : WHILE expr DO statements END
    ;

expr
    : simple ((EQ|NE|GE|GT|LE|LT) simple)?
    ;

simple
    : MINUS? term ((PLUS | MINUS | OR) term)*
    ;

term
    : factor ((MUL|DIV|REM|AND) factor)*
    ;

factor
    : array_access
    | function_call
    | ID
    | OPENPAR expr CLOSEPAR
    | NUM
    | NOT factor
    | TRUE
    | FALSE
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

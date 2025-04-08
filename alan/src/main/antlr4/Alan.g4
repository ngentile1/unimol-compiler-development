grammar Alan;

@header{
package it.unimol.alan;

import it.unimol.alan.TooLongIDException;
}

source
    : SOURCE ID funcdef* body
    ;

funcdef
    : FUNCTION ID OPENPAR (type ID (COMMA type ID)*)? CLOSEPAR (TO type)? body
    ;

body
    : BEGIN vardef* statements END
    ;

type
    : (BOOL|INT) ARRAY?
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

assign
    : ID (OPENBRA simple CLOSEBRA)? ASSIGNMENT (expr | ARRAY simple)
    ;

expr_list
    : expr (COMMA expr)*
    ;

call
    : CALL ID OPENPAR expr_list? CLOSEPAR
    ;

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
    : GET ID (OPENBRA simple CLOSEBRA)?
    ;

leave
    : LEAVE expr?
    ;

output
    : PUT (STRING | expr) (DOT (STRING|expr))*
    ;

while
    : WHILE expr DO statements END
    ;

expr
    : simple (relop simple)?
    ;

relop
    : EQ
    | GE
    | GT
    | LE
    | LT
    | NE
    ;

simple
    : MINUS? term (addop term)*
    ;

addop
    : MINUS
    | PLUS
    | OR
    ;

term
    : factor (mulop factor)*
    ;

mulop
    : AND
    | DIV
    | MUL
    | REM
    ;

factor
    : ID (OPENBRA simple CLOSEBRA)?
    | ID (OPENPAR expr_list? CLOSEPAR)?
    | OPENPAR expr CLOSEPAR
    | NUM
    | NOT factor
    | TRUE
    | FALSE
    ;

factor_tail
    : OPENBRA simple CLOSEBRA
    | OPENPAR expr_list? CLOSEPAR
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

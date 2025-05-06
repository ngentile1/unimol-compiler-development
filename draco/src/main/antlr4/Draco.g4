grammar Draco;

@header {
package it.unimol.draco;

import it.unimol.draco.IncludeNotAtBeginOfLineException;
}

INCLUDE
    : { getCharPositionInLine() == 0}? ('#'|'\\') INCLUDE_PATH ('\n'|'\r') 
    ;

fragment INCLUDE_FILENAME
    : ([a-zA-Z_][a-zA-Z0-9_\-]*) ('.' [a-zA-Z0-9_]+)*
    ;

fragment INCLUDE_PATH 
    : INCLUDE_FILENAME (':' INCLUDE_FILENAME)* ('/' INCLUDE_FILENAME)*
    ;

COMMENT
    : '/*' .*? '*/' -> skip
    ;

INTEGER
    : [1-9] [0-9]*
    | '0'
    | ('0x' | '0X') [0-9a-fA-F]+
    | ('0b' | '0B') [01]+
    | ('0o' | '0O') [0-7]+
    ;

fragment ESCAPE_CHAR
    : 'b'
    | 't'
    | 'r'
    | 'n'
    | 'e'
    | '#'
    | '\\'
    | '"'
    ;

fragment PRINTABLE_CHAR
    : ('\\' ESCAPE_CHAR)
    | ('\u0020'..'\u0021'|'\u0023'..'\u005b'|'\u005d'..'\u007E') //excluding " and \
    | '\\(0' [xX] [0-9a-fA-F][0-9a-fA-F]  ')'
    | '\\(' ID ')'
    ;

CHAR
    : '\'' PRINTABLE_CHAR* '\''
    ;

SINGLE_STRING 
    : '"' PRINTABLE_CHAR* '"'
    ;

string
    : SINGLE_STRING+
    ;

EQ: '=';
GE: '>=';
GT: '>';
LE: '<=';
LT: '<';
NE: '<>';
MINUS: '-';
PLUS: '+';
DIV: '/';
MUL: '*';
TRUE: 'true';
FALSE: 'false';
OPEN_PAR: '(';
CLOSE_PAR: ')';
OPEN_CURLY: '{';
CLOSE_CURLY: '}';
OPEN_BRACK: '['; 
CLOSE_BRACK: ']';
COMMA: ',';

WS
    : ([ \t\r\n] | '\u0000'..'\u001F')+ -> skip
    ;

proc_decl
    : ID '(' params? ')' type
    ;

procs_decl
    : 'extern' proc_decl (',' proc_decl)* ';' 
    ;

program
    : INCLUDE* decls procedure*
    ;

types_decl
    : 'type' ID '=' type (',' ID '=' type)*';'
    ;

var_decl
    : ID ('@' expr)? ('=' expr)?
    ;

vars_decl
    : ('register')? type var_decl (',' var_decl)* ';'
    ;

const_expr
    : INTEGER
    | CHAR
    | FLOAT
    | string
    | 'false'
    | 'true'
    ;

base_expr
    : ID
    | fun_call
    | '(' expr ')'
    ;

fun_call
    : ID '(' (expr ((';'|',') expr)* (';'|',')?)?  ')'
    | io_expr
    | 'pretend' '(' expr ',' type ')'
    ;

expr
    : or_expr 
    | const_expr
    | '(' expr ')' ('.' postifix_op_expr)*
    | if_expr
    | assignemnt_expr
    ;
    
postifix_op_expr
    : base_expr postfix_op*
    ;
    
postfix_op
    : '*'
    | '[' expr (',' expr)* ']'
    ;

deref_expr
    : ('&'|'*')* postifix_op_expr
    ;

field_expr
    : deref_expr ('.' postifix_op_expr)*
    ;

postfix_int_op_expr
    : ('~'|'|'|'-'|'+')* (field_expr|const_expr)
    ;

bitbin_op
    : '><'
    | '<<'
    | '>>'
    | '&'
    | '|'
    ;

bitwise_expr
    : postfix_int_op_expr (bitbin_op postfix_int_op_expr)*
    ;

alg1_expr
    : bitwise_expr (('*'|'/'|'%') bitwise_expr)*
    ;

alg2_expr
    : alg1_expr (('+'|'-') alg1_expr)*
    ;

cmp_expr
    : alg2_expr (('='|'~='|'<'|'>'|'<='|'>=') alg2_expr)*
    ;

neg_expr
    : 'not'* '(' expr ')'
    | 'not'* cmp_expr
    ;

and_expr
    : neg_expr ('and' neg_expr)*
    ;
    
or_expr
    : and_expr ('or' and_expr)*
    ;
    
ID
    : [a-zA-Z_] [a-zA-Z0-9_]* 
    ;

dimensions
    : (expr|'*') (',' (expr|'*'))*
    ;

array_type
    : '[' dimensions ']' type
    ;

ptr_type
    : '*' type
    ;

fun_type
    : 'proc' '(' params? ')' type
    ;

struct_type
    : 'struct' '{' (type ID (',' ID)* ';')+ '}'
    ;

union_type
    : 'union' '{' (type ID (',' ID)* ';')+ '}'
    ;

enum_type
    : 'enum' '{' ID (',' ID)* '}'
    ;

type
    : ('signed'|'unsigned')? ID
    | array_type
    | ptr_type
    | struct_type
    | enum_type
    | union_type
    | fun_type
    | 'file' '(' expr? ')'
    | 'channel' ('input' | 'output') ('binary'|'text')
    ;

param
    : 'register'? type? ID
    ;

params
    : param ((';'|',') param )* (';'|',')?
    ;

decls
    : (vars_decl | procs_decl | types_decl)*
    ;

procedure
    : 'proc' 'nonrec'? ID '(' params? ')' type ':' decls (expr | (stmt+ expr?)) 'corp' ';'
    ;

left_hand_expr
    : (field_expr | fun_call) ('.' field_expr)*
    ; 

assignemnt_expr
    : left_hand_expr ':=' expr
    ;

assignemnt_stmt
    : assignemnt_expr 
    ;

if_expr
    : 'if' stmt* expr 'then' stmt* expr if_expr_tail
    ;

if_expr_tail
    : 'fi' 
    | 'else' stmt* expr if_expr_tail
    | 'elif' stmt* expr 'then' stmt* expr if_expr_tail
    ;

if_stmt_body
    : stmt+ expr?
    | expr
    ;

if_stmt
    : 'if' stmt* expr 'then' stmt* if_stmt_tail
    | if_expr
    ;

if_stmt_tail
    : 'fi'
    | 'else' if_stmt_body? 'fi'
    | 'elif' stmt* expr 'then' if_stmt_body? if_stmt_tail
    ;

while_stmt
    : 'while' stmt* expr 'do' stmt* 'od'
    ;

for_stmt
    : 'for' ID 'from' expr ('by' expr)? ('upto'|'downto') expr 'do' stmt* 'od'
    ;

case_stmt
    : 'case' expr case_stmt_body* 'esac'
    ;

case_stmt_body
    : 'incase' case_expr ':' stmt* case_stmt_body*
    | 'default' ':' stmt* case_stmt_body*
    ;

case_expr
    : INTEGER
    | '-' INTEGER
    | CHAR
    | ID
    | range
    ;

range
    : INTEGER '..' INTEGER
    | CHAR '..' CHAR
    ;

call_stmt
    : 'ignore'? fun_call
    ;

stmt_body
    : assignemnt_stmt
    | if_stmt
    | while_stmt
    | for_stmt
    | call_stmt
    | case_stmt
    | io_expr
    ;

stmt
    : stmt_body? ';'
    ;

INT_FORMATTER
    : 'x'
    | 'b'
    | 'o'
    ;

formatted_param
    : expr (':' expr)*
    ;

formatted_params
    : formatted_param (',' formatted_param)*
    ;

io_func_name
    : 'read' 
    | 'write' 
    | 'readln' 
    | 'writeln'
    ;

io_expr 
    : io_func_name '(' ((expr|'*') ';')? formatted_params? ')' 
    ;

FLOAT
    :   DECIMAL_FLOAT
    |   SPECIAL_FLOAT
    |   HEX_FLOAT
    ;

DECIMAL_FLOAT
    :   SIGN? DIGITS '.' DIGITS? EXPONENT?          // F-format, with optional exponent
    |   SIGN? '.' DIGITS EXPONENT?                  // Starting with dot
    |   SIGN? DIGITS '.' EXPONENT?                  // Ending with dot
    |   SIGN? DIGITS EXPONENT                       // E-format, no dot
    ;

SPECIAL_FLOAT
    :   SIGN? '0f' ( 'NaN' | 'Inf' )                 // Special forms, case insensitive
        { setText(getText().toLowerCase()); }
    ;

HEX_FLOAT
    :   '0f' [xX] HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
        HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
        HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
        HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT    // 16 hex digits
    ;

fragment DIGITS
    :   [0-9]+
    ;

fragment HEX_DIGIT
    :   [0-9a-fA-F]
    ;

fragment EXPONENT
    :   [eE] [+\-]? DIGITS
    ;

fragment SIGN
    :   [+\-]
    ;
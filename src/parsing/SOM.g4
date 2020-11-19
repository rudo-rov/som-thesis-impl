grammar SOM;

/* Literals */
literal: literalNumber | literalString;

literalNumber: MINUS? (INTEGER | DOUBLE);

literalString: STRING;

/* TERMINAL SYMBOLS */
WHITESPACE: [\t\r\n]* -> skip;

INTEGER: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
STRING:
    SIMPLE_QUOTE
    ( '\\t'                     // Tab
    | '\\n'                     // New line
    | '\\\''                    // \'
    | '\\\\'                    // \\
    | ~(SIMPLE_QUOTE | '\\') 
    )*
    SIMPLE_QUOTE
;

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
EQUALS: '=';

GREATER: '>';
LESS: '<';
GREATER_EQ: '>=';
LESS_EQ: '<=';

ASSIGN: ':=';
SEPARATOR: '----';
VBAR: '|';
SIMPLE_QUOTE: '\'';

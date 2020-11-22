grammar SOM;

// Classes
classDefinition:
    IDENTIFIER EQUALS superClass OPEN_PAR
    instanceFields method*
    (SEPARATOR classFields method*)?
    CLOSE_PAR
;

superClass: IDENTIFIER?; // Doesn't have to have superclass explicitly stated

instanceFields: (VBAR variable* VBAR)?;

classFields: (VBAR variable* VBAR)?;

variable: IDENTIFIER;

// Methods
method: messageSignature EQUALS methodBlock;

messageSignature: unarySignature | keywordSignature;

unarySignature: unaryMessage;

keywordSignature: (keyword argument)+;

keyword: IDENTIFIER COLON;

argument: variable;

unaryMessage: IDENTIFIER;

keywordMessage: ; // TBD

methodBlock: OPEN_PAR blockContent CLOSE_PAR;

blockContent:
    VBAR variable* VBAR
    blockBody
;

blockBody: ;

/* Literals */
literal: literalNumber | literalString | literalArray;

literalNumber: MINUS? (INTEGER | DOUBLE);

literalString: STRING;

literalArray: HASH OPEN_PAR literal* CLOSE_PAR;

// Expressions
expression: assignation | evaluation;

evaluation: (variable | literal) messages?;

assignation: ;

messages: ;

/* TERMINAL SYMBOLS */
WHITESPACE: [\t\r\n]* -> skip;
COMMENT: '"' ~["]* '"' -> skip;

IDENTIFIER: [\p{Alpha}] [\p{Alpha}0-9_]*;

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
OPEN_PAR: '(';
CLOSE_PAR: ')';
COLON: ':';
HASH: '#';

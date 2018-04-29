grammar calc;

ecuacion: expresion relop expresion ;
expresion: multiplyingexpresion ((PLUS | MINUS) multiplyingexpresion)*;
multiplyingexpresion: powexpresion ((TIMES | DIV | MOD) powexpresion)*;
powexpresion: signedAtom (POW signedAtom)*;
signedAtom: PLUS signedAtom  | MINUS signedAtom  | func | atom ;
atom: scientific | variable | constante | PAREN_IZQ expresion PAREN_DER ;
scientific: NUMERO;
constante: PI | EULER | I ;
variable: VARIABLE;

func: func_nombre PAREN_IZQ expresion (COMMA expresion)* PAREN_DER;

func_nombre: COS | TAN | SIN | ACOS | ATAN | ASIN | LOG | LN | SQRT ;

relop: EQ | GT | LT;

COS: 'cos';
SIN: 'sin';
TAN: 'tan';
ACOS: 'acos';
ASIN: 'asin';
ATAN: 'atan';
LN: 'ln';
LOG: 'log';
SQRT: 'sqrt';
PAREN_IZQ: '(';
PAREN_DER: ')';
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIV: '/' ;
MOD: '%';
GT: '>' ;
LT: '<';
EQ: '=';
COMMA: ',';
POINT: '.';
POW: '^';
PI: 'pi';
EULER: E2;
I: 'i';
VARIABLE: VALID_ID_START VALID_ID_CHAR* ;
fragment VALID_ID_START: ('a' .. 'z') | ('A' .. 'Z') | '_';
fragment VALID_ID_CHAR: VALID_ID_START | ('0' .. '9');
NUMERO: NUM ((E1 | E2) SIGN? NUM)?;
fragment NUM: ('0' .. '9') + ('.' ('0' .. '9') +)?;
fragment E1: 'E';
fragment E2: 'e';
fragment SIGN: ('+' | '-');
WS: [ \r\n\t] + -> skip;

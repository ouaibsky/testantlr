grammar SmartRfq;


@header {
}

options {
//tokenVocab=Strings;
}

file: smartrfq (SEMICOLON smartrfq?)*;

smartrfq: qty instrument market? maturity option;

qty: QTY;

instrument: NAME |  STRING ;

maturity: DATE_SHORT | DATE_LONG;

option: optExecType optType ref?;

optExecType: OPT_EXEC_TYPE;
optType: OPT_TYPE;

ref: REF INTEGER;

market: NAME;


DATE_SHORT: MONTH YEAR;
DATE_LONG: DAY MONTH YEAR;

fragment DAY: [0-9] | [1-2][0-9] | [3][0-1];
fragment MONTH  : [jJ][aA][nN]
                | [fF][eE][bB]
                | [mM][aA][rR]
                | [aA][pP][rR]
                | [mM][aA][yY]
                | [jJ][uU][nN]
                | [jJ][uU][lL]
                | [aA][uU][gG]
                | [sS][eE][pP]
                | [oO][cC][tT]
                | [nN][oO][vV]
                | [dD][eE][cC]
                ;

fragment YEAR: [2][0][1-9][0-9];

QTY: ('+' | '-' | '=')[0-9][0-9]*('k'|'m'|'g')?;

INTEGER: [0-9][0-9]*;

NAME: [a-zA-Z0-9][a-zA-Z0-9,_-]+;
STRING : '\'' ( '\\' [\\'] | ~[\\'\r\n] )* '\'';

REF: [rR][eE][fF]':';

OPT_EXEC_TYPE: AMERICAN | EUROPEAN;
OPT_TYPE: CALL | PUT;

fragment AMERICAN: [aA];

fragment EUROPEAN: [eE];

fragment CALL: [cC];

fragment PUT: [pP];

SEMICOLON: ';';


WS : [ \r\t\n]+ -> skip ;

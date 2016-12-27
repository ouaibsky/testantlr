grammar test;

file: smartrfq (SEMICOLON smartrfq)?;

smartrfq: qty instrument market? maturity option;

qty: QTY;

instrument: NAME;

maturity: DATE_SHORT | DATE_LONG;

option: optExecType optType ref?;

optExecType: OPT_EXEC_TYPE;
optType: OPT_TYPE;

ref: 'ref:' INTEGER;

market: NAME;

DATE_SHORT: MONTH YEAR;
DATE_LONG: DAY MONTH YEAR;

fragment DAY: [0-9] | [1-2][0-9] | [3][0-1];
fragment MONTH: 'JAN' | 'FEB' | 'MAR' | 'APR' | 'MAY' | 'JUN' | 'JUL' | 'AUG' | 'SEP' | 'OCT' |  'NOV' | 'DEC';
fragment YEAR: [2][0][1-9][0-9];

QTY: ('+' | '-' | '=')[0-9][0-9]*('k'|'m'|'g')?;

INTEGER: [0-9][0-9]*;

NAME: [a-zA-Z0-9][a-zA-Z0-9,_-]+;

OPT_EXEC_TYPE: AMERICAN | EUROPEAN;
OPT_TYPE: CALL | PUT;

fragment AMERICAN: [aA];

fragment EUROPEAN: [eE];

fragment CALL: 'c' | 'C';

fragment PUT: 'p' | 'P';

SEMICOLON: ';';

WS : [ \r\t\n]+ -> skip ;

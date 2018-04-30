%{

%}

%%
factorial ( [0-9]+ ){		{ printf("(func_factorial, num,_,_)");}
[a-z]|[0-9]|[A-Z]*		{ printf("(identificador,_,_,_)");}
return [0-9]+			{ printf("(read,x,_,_)");
				  return; }
return [0-9]+ * factorial ( [a-z]|[0-9]|[A-Z]* - [0-9]+ ) {printf("(gt,func_factorial, num,_)");}
if ([0-9]+ == 0) {              { printf("(gt,x,%d,t1)"); printf("(if_f,t1,L1,_)"); }
}				{ printf("(parar,_,_,_)");}
\n                              /* nothing */;
[ \t]+                          /* nothing */;
[;]                             /* nothing */;

%%
main(argc, argv) int argc;
char **argv;
{
	if(argc > 1) {
		if(!(yyin = fopen(argv[1], "r"))) {
			perror(argv[1]);
			return (1);
		}
	}
  yylex();
  return 0;
}

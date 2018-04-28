#Checks if tokens are valid.

print("Analisis Sintactico Descendente Recursivo\n")
print("Gramatica: \n")
print("A -> B C")
print("A -> ant A all")
print("B -> big C")
print("B -> bus A boss")
print("B -> <empty>")
print("C -> cat")
print("C -> cow\n\n")
print("Escriba los tokens separados por espacios")
tokens = raw_input().split()
terminals = ["ant",
			 "all",
			 "big",
			 "bus",
			 "boss",
			 "cat",
			 "cow"
			 ]

lexer(tokens)

for token in tokens:

	#Checks if tokens are valid
	if token not in terminals:
		print("Error lexico: No se reconoce \""+token+"\"")
		exit(1)

	A() #Initial symbol
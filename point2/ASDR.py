#Checks if tokens are valid.
def A():
    if token == "big" or token == "bus" or token == "cat":
        B()
        C()
    elif token == "ant":
        match("ant")
        A()
        match("all")
    else:
        pass #syntax_error("big", "bus", "cat", "ant")

def B():
    if token == "big":
        match ("big")
        C()
    elif token == "bus":
        match ("bus")
        A()
        match("boss")
    else:
        match("")

def C():
    if token == "cat":
        match("cat")
    elif token == "cow":
        match("cow")
    else:
        pass #syntax_error("cat", "cow")

def next_token():
    token = tokens.pop(0)
    if token not in terminals:
        print("Error lexico: No se reconoce \"" + token + "\"")
        exit(1)

def match(expected):
    #global token
    if token == expected:
        next_token()
    else:
        syntax_error(expected)

def syntax_error():
    pass

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
tokens = raw_input().split() #Input (Modify this for file input)
terminals = ["ant",
			 "all",
			 "big",
			 "bus",
			 "boss",
			 "cat",
			 "cow"
			 ]

token = ""
next_token()
A() #Initial symbol
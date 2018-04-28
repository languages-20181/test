#Checks if tokens are valid.
def A():
    global token
    if token == "big" or token == "bus" or token == "cat":
        B()
        C()
    elif token == 'ant':
        token = match("ant")
        A()
        token = match("all")
    else:
        syntax_error(["big", "bus", "cat", "ant"])

def B():
    global token
    if token == "big":
        token = match ("big")
        C()
    elif token == "bus":
        token = match ("bus")
        A()
        token = match("boss")

def C():
    global token
    if token == "cat":
        token = match("cat")
    elif token == "cow":
        token = match("cow")
    else:
        syntax_error(["cat", "cow"])

def next_token():
    global token
    if len(tokens) == 0:
        return "EOF"
    token = tokens.pop(0)
    if token not in terminals:
        print("Error lexico: No se reconoce \"" + token + "\"")
        exit(1)
    return token

def match(expected):
    global token
    if token == expected:
        token = next_token()
    else:
        syntax_error([expected])
    return token

def syntax_error(expected_values):
    if len(expected_values) == 1:
        print "Error sintactico, se esperaba un \'" + expected_values[0] + "\'"
    else:
        print "Error sintactico, se esperaban algunos de los siguientes tokens:"
        for t in expected_values:
            print t

    exit(2)

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

if (token == "EOF"):
    print ("Analisis sintactico completado exitosamente.")
else:
    syntax_error(["EOF"])
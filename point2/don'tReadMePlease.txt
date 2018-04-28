Input: String
Output: ???

Grammar:

A -> B uno		{tres, cuatro}
A -> dos		{dos}
B -> tres		{tres}
B -> cuatro A	{cuatro}

p(A) = {dos, tres, cuatro}
p(B) = {tres, cuatro}

s(A) = {uno, $}
s(B) = {uno}

uno dos tres cuatro --> syntaxError('"uno" not Expected')
cuatro tres dos uno --> A1 | B2 --> syntaxError('')
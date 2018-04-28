Input: String
Output: ???

Grammar:

A -> B C 		{big, bus, cat}
A -> ant A all	{ant}
B -> big C 		{big}
B -> bus A boss	{bus}
B -> <empty>	{<empty>}
C -> cat 		{cat}

p(A) = {big, bus, cat}
p(B) = {big, bus, <empty>}
p(C) = {cat}

s(A) = {$, all, boss}
s(B) = {cat}
s(C) = {$, all, boss, cat}
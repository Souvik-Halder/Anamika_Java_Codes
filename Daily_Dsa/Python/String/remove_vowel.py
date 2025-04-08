str = input()
newStr = ""
for a in str:
    if (
        a == "a"
        or a == "i"
        or a == "o"
        or a == "e"
        or a == "u"
        or a == "A"
        or a == "I"
        or a == "O"
        or a == "E"
        or a == "U"
    ):
        continue
    else:
        newStr += a
print(newStr)

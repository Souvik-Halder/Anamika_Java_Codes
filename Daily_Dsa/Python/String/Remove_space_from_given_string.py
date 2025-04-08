str = input()
newStr = ""

for a in str:
    if a == " ":
        continue
    else:
        newStr += a

print(newStr)

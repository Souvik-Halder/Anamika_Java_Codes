str = input().lower()
newStr = ""
for i in range(len(str) - 1, -1, -1):  # Reverse a loop
    newStr = newStr + str[i]


if str == newStr:
    print("True", end="")
else:
    print("False", end="")


# How to run a loop in python
# How to run a reverse loop in python
# How to traverse an array in Python
# How to traverse an array in Python in reverse order
# How to traverse an dictionary in Python
# How to traverse an dictionary in Python in reverse order
# How to traverse an Set in Python
# How to traverse an Set in Python in reverse order

n = int(input("Enter the number upto which u want to print the series:  "))
a = 0
b = 1
print(a)
print(b)
for i in range(0, n - 2):
    sum = a + b
    print(sum)
    a = b
    b = sum

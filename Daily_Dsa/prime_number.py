n = int(input("Enter a nubmer"))
isPrime = True
for i in range(2, n):
    if n % i == 0 or n != 2:
        isPrime = False
        break
if isPrime:
    print("The number is prime ")
else:
    print("The number is not prime")

num = int(input())
isPrime = True
for i in range(2, num):
    if num % i == 0:
        isPrime = False
        break

if isPrime:
    print(True)
else:
    print(False)

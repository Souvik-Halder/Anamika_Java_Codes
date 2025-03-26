arr = list(map(int, input().strip().split()))
print(arr)


def checkIsPrime(num):
    isNumberPrime = True
    for j in range(2, num):
        if num % j == 0:
            isNumberPrime = False
    return isNumberPrime


num1 = arr[0]
num2 = arr[1]
for i in range(num1, num2):
    isPrimeBoolean = checkIsPrime(i)
    if isPrimeBoolean:
        print(i)

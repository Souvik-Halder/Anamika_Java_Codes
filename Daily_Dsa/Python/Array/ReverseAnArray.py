def swap(arr, a, b):
    arr[a], arr[b] = arr[b], arr[a]


arr = list(map(int, input().strip().split()))

left, right = 0, len(arr) - 1
while left < right:  # Optimized condition
    swap(arr, left, right)
    left += 1
    right -= 1

for num in arr:
    print(num)

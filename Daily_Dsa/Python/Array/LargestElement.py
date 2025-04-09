import sys

arr = list(map(int, input().strip().split()))

max_el = max(arr)
print(max_el)


##Second minimum element
second_largest = -sys.maxsize - 1
for a in arr:
    if a > second_largest and a < max_el:
        second_largest = a
print(second_largest)

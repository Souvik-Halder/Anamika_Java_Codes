import sys

arr = list(map(int, input().strip().split()))

minimum_el = min(arr)
print(minimum_el)


##Second minimum element
second_min = sys.maxsize
for a in arr:
    if a < second_min and a > minimum_el:
        second_min = a
print(second_min)

arr = list(map(int, input().strip().split()))
my_set = set()

for a in arr:
    my_set.add(a)
n = len(my_set)
i = 0
for b in my_set:

    if n - 1 == i:
        print(b, end="")
    else:
        print(b, end=" ")
    i += 1
print()

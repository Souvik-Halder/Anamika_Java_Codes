nums1 = [1, 2, 3, 4, 5]
nums2 = [1, 2, 7]
n1 = len(nums1)
n2 = len(nums2)
arr = []
i = 0
j = 0

while i < n1 and j < n2:
    if nums1[i] <= nums2[j]:
        if len(arr) == 0 or arr[-1] != nums1[i]:
            arr.append(nums1[i])
        i += 1
    else:
        if len(arr) == 0 or arr[-1] != nums2[j]:
            arr.append(nums2[j])
        j += 1
while i < n1:
    if len(arr) == 0 or arr[-1] != nums1[i]:
        arr.append(nums1[i])
    i += 1
while j < n2:
    if len(arr) == 0 or arr[-1] != nums2[j]:
        arr.append(nums2[j])
    j += 1
print(arr)

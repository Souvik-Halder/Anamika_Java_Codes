str = input().lower()
count_vowel = 0
count_cons = 0
count_digit = 0
for a in str:
    if "0" <= a and a <= "9":
        count_digit += 1
    else:
        if a == "a" or a == "i" or a == "o" or a == "e" or a == "u":
            count_vowel += 1
        else:
            count_cons += 1
print(count_vowel)
print(count_cons)
print(count_digit)

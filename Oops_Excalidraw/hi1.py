from collections import Counter


def max_planks(wood):
    length_count = Counter(wood)
    max_count = 0
    for target_length in length_count:
        count = length_count[target_length]
        used_pairs = set()
        for length in length_count:
            if length >= target_length:
                continue
            needed_pair = target_length - length
            if needed_pair in length_count:
                pair = tuple(sorted((length, needed_pair)))
                if pair not in used_pairs:
                    pairs_to_add = min(length_count[length], length_count[needed_pair])
                    count += pairs_to_add
                    used_pairs.add(pair)
        max_count = max(max_count, count)
    return max_count


# Example usage with the provided test cases
test_cases = [
    [22, 12, 13, 22, 22, 22, 14, 22, 17, 22],
    [8, 13, 7, 13, 5, 13, 4, 13, 6, 13],
]

for i, wood in enumerate(test_cases):
    max_plank_count = max_planks(wood)
    print(f"Test Case {i + 1}: Maximum number of planks = {max_plank_count}")

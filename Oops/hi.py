def max_planks(wood):
    # Count the occurrences of each wood length
    length_count = {}

    # Count individual pieces
    for length in wood:
        if length in length_count:
            length_count[length] += 1
        else:
            length_count[length] = 1

    max_count = 0  # To keep track of the maximum number of planks

    # Check for all possible plank lengths
    for length in length_count:
        count = length_count[length]  # Number of pieces of this length

        # Check for combinations of two pieces
        used_pairs = set()  # To avoid double counting pairs
        for i in range(len(wood)):
            for j in range(i + 1, len(wood)):
                combined_length = wood[i] + wood[j]
                if combined_length == length:
                    pair = (min(wood[i], wood[j]), max(wood[i], wood[j]))
                    if pair not in used_pairs:
                        count += 1
                        used_pairs.add(pair)

        # Update the maximum count if needed
        max_count = max(max_count, count)

    return max_count


# Example usage
test_cases = [
    [22, 12, 13, 22, 22, 22, 14, 22, 17, 22],
    [8, 13, 7, 13, 5, 13, 4, 13, 6, 13],
]

for i, wood in enumerate(test_cases):
    max_plank_count = max_planks(wood)
    print(f"Test Case {i + 1}: Maximum number of planks = {max_plank_count}")

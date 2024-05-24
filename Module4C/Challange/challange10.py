# Create a function that filters out negative numbers.10.PYTHON CODING CHALLENGE

def filter_negative_numbers(numbers):
    return [num for num in numbers if num >= 0]

# Example usage
numbers = [-4, 15, 10, 20, 1, 2, -3, -4]
filtered_numbers = filter_negative_numbers(numbers)
print(filtered_numbers)
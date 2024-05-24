# Return the number of vowels in a string
def count_vowels(s):
    return sum(1 for char in s if char.lower() in 'aeiou')

# Example usage
string = "importance"
vowel_count = count_vowels(string)
print(vowel_count)  # Output: 4
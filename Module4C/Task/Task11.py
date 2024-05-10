# Create a function that accepts two numbers, adds the numbers and prints out the result in the console
# Create a function that return the string value "Testify Python"
# Invoke/call the two functions
from operator import add


# function that add 2 number
def addition(num1, num2):
    result = num1 + num2
    print("result ", num1 + num2)

# function that print
def string_testify():
    return "Testify python"

# invoking the two function
addition(12, 2)
print(string_testify())


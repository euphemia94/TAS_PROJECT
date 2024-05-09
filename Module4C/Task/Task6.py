# Declare two numbers with any values
# Check if the first number is greater than 50 and check if the second number is less than 100, if True print out
# "Evaluation is True"
# Add an else block that prints "Evaluation is False"
# Declare a string with value "python"
# Check if the first string is equal to "testify" or "python", if True prints out "Yay!! The string is a Testify Python".
#
# Use the logical and to check if the first number is greater than 50 and the second number is less than 100.

number1 = 30
number2 = 50
if number1 > 50:
    print("Evaluation is true")
else:
    print("Evaluation is false")

# if number is less than 100
if number2 < 100:
    print("Evaluation is true")
else:
    print("Evaluation is false")

# declare a string
string = "python"
if string == "testify" or string == "python":
    print("Yey!! the string is a Testify Python")

# using logical operators
if number1 > 50 and number2 < 100:
    print("Evaluation is true")
else:
    print("Evaluation is false")
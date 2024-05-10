# Use for loop to iterate from 0 to 10
# For each iteration print out "Number ", i
# If the i value is equal to 2 add the continue
# If the i value is equal to 8 add the break statement

print("for loop, break and continue")
number = 10
for i in range(number):
    if i == 2:
        continue
    print("Number ", i)
    if i == 8:
        break
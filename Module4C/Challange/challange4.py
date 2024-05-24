# Print a table containing multiplication tables

def print_simple_multiplication_table():
    for i in range(1, 11):
        for j in range(1, 11):
            print(f"{i * j:4}", end=" ")
        print()

# Call the function to print the multiplication table
print_simple_multiplication_table()
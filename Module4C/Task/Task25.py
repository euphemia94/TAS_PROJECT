# Create a class called Utilities
# Create a static method called print_name which accepts a parameter, and prints out the parameter.
# Invoke the static method print_name()
# You can use any of the two methods to create your static methods.

class Utilities:
    def print_name(name):
        print(name)
    print_name = staticmethod(print_name)

# Invoking the static method
Utilities.print_name("uche")


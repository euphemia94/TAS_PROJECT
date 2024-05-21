# Create a class called Human
# Add an attribute leg_count with the value of 4
# Add a method called get_gender() that returns "Unknown" in the Human class
# Create another class called Man that extends Human
# Optionally you can instantiate the classes Man and Woman then print out the values of the get_gender()
class Human:
    leg_count = 4

    def get_gender(self):
        return "unknown"
class Man(Human):
    def get_gender(self):
        return "man"


class Woman(Human):
    def get_gender(self):
        return "Female"

man = Man()
woman = Woman()
print(man.get_gender(), woman.get_gender())

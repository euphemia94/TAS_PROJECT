# Create an abstract class called Vehicle
# Create an abstract method called drive_direction()
# Create another class Car that inherits from Vehicle
# Create another class Plane that inherits from Vehicle
# Try running the program and fix the abstract method issues
# Optionally instantiate the Car and Plane method, then invoke the drive_direction() in each of the object instances.
# the drive_direction() method in your Car should print "c", while drive_direction() in
# your Plane class should print "Drive Upward"
import abc


class Vehcle(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def drive_direction(self):
        pass
class Car(Vehcle):
    def drive_direction(self):
        print("Drive forward")

class Plan(Vehcle):
    def drive_direction(self):
        print("Drive Upward")

car = Car()
plan = Plan()

car.drive_direction()
plan.drive_direction()


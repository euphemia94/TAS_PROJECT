package task.Task19;

public class Task19d {
    //THIS https://i.imgur.com/aRkRDPa.png You have a class with a method printName.
    // write a code in the printName method that will print the instance member which is
    // "Delta" and whatever name the user enter when invoking the method
        private String name = "Delta"; // Instance member

        public void printName(String userName) {
            System.out.println("Instance member: " + name);
            System.out.println("User input: " + userName);
        }
}


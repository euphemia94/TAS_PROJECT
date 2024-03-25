package task.task11;

public class B_class {
    public static void main(String[] args) {
        //Create an object of that class
        // in another class "B" and SOUT the contents from the methods in class A
        // to create object  A_class
        A_class person = new A_class();
        person.name = "uche";
        person.myName(person.name);


    }
}

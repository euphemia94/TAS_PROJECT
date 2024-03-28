package task.Task19;

public class Task19c extends Task19a {
    public void main(String[] args) {
        //SUPER: Class B is extending Class A, Class B has a variable String name =
        // "Anderson" while Class A has the same varible name and type is an attribute
        // "Ronke". Print out the value of Class A and class B
        // in your main method using the object of only One class. (Dont create two objects).
        String name = "Ronke";
        System.out.println(name);
        System.out.println(super.name);
    }
}

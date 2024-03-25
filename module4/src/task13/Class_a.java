package task13;

public class Class_a {
    //Create 3 different constructors of a class A.
    // Create 3 objects of Class A in class B and use the 3 different constructors
    // when creating each of the objects of class A in class B
    //to create i right click and click generate, select constructor.
    String foods;
    int noOfPlate;
    boolean available;

    //public Class_a() {
    //    } this is a constructor with any value

    public Class_a(String foods) {
        this.foods = foods;
    }

    public Class_a(int noOfPlate) {
        this.noOfPlate = noOfPlate;
    }
    public Class_a(String foods, int noOfPlate, boolean available) {
        this.available = available;
    }
}

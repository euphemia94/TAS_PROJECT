package task.task12_b;

import task.task12_a.A_class;

public class B_class {
    public static void main(String[] args) {
        // A_class accessA = new A_class();
        //  accessA.aClassAccessMethod();
        //  i was abe to access accessA becaus it is public

        //the method below is private hence should only be accessed only this class
        B_class accessB = new B_class();
        accessB.bClassAccessMethod();

    }
    private void bClassAccessMethod (){

        System.out.println("this method should only be accessd in this class");
    }

}

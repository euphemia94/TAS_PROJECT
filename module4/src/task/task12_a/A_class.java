package task.task12_a;

public class A_class {
    public static void main(String[] args) {
        //Create two packages. in each of the packages create one class each Class A and
        // Class B. create a method in class A that can be accessed anywhere in
        // that project and create a method in Class B that can only be accessed
        // within a class

        //class that can be accessed anywhere
        A_class accessA = new A_class();
        accessA.aClassAccessMethod();
    }
    public void aClassAccessMethod (){
        System.out.println("this method should be accessed anywhere");
    }

}


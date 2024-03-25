package Task15;

public class Child_b extends Parent_a{
    public static void main(String[] args) {
        //invoking all the methods
        Child_b child = new Child_b();
        child.method1();
        child.method2();
        child.method3();
        child.method4();
        child.method5();
    }
    // Method 4 and 5
    public void method4() {
        System.out.println("i am the 4th method");
    }
    public void method5() {
        System.out.println("i am the 5th method");
    }
}

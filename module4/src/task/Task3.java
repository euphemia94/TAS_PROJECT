package task;

public class Task3 {
    public static void main(String[] args) {
        //Create a variable and store your age in it. concatenate your age with a string and print
        // it out on the console using the two methods of conacatenation youwere taught
        int age = 30;
        String ageDescription = " is my actual age";
        String myAge = age + ageDescription;
        //System.out.println(myAge);

        //2. using the .concat method
        ageDescription.concat(age+"");
        System.out.println(ageDescription.concat(age+""));
    }
}


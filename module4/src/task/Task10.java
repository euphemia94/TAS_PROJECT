package task;

public class Task10 {
    public static void main(String[] args) {
        //Create a method that verify that visitors on the slack channel are coming
        // fot testify Trainings. If they write" Testify" then print out a
        // welcome messsage if not , the user should be shown rejection message.
        // after creating this method,then invoke the created method in your main method
        Task10 verifyVisTestify = new Task10();
        String message = "Testify";
        verifyVisTestify.verifyVisitors(message);
    }
    public static void verifyVisitors(String message) {
        if (message.equals("Testify")) {
            System.out.println("Welcome to the Testify Training channel!");
        } else {
            System.out.println("Sorry, you are not authorized to access this channel.");
        }
    }
}

package task.Task19;

public class Task19b extends Task19a {
    public static void main(String[] args) {
        //STATIC: I want to use the value of a variable in one class in another class at runtime.
        // I also want to access the variable without creating an object of its class.
        // Help me implement this
        Task19b access19a = new Task19b();
        access19a.BallColour();

    }
}

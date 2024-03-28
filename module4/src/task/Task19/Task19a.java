package task.Task19;

public class Task19a {
    //FINAL: create 3 variables of a class A, ballSize, ballColour, ballTexture.
    // and make it impossible to change the value the ballSize in any method in that class
    final String ballSize;
    String ballColour;
    String ballTexture;
    String name = "Anderson";

    public Task19a() {
        ballSize = "large";
    }
    public void BallColour() {
        ballColour="blue";
        System.out.println("the ball is" + ballSize + "and is" + ballColour);
    }
    public void setBallColour() {
        ballColour = "red";
        System.out.println(ballColour);
    }
    public void BallTexture() {
        ballTexture="blue";
        System.out.println("the ball is" + ballSize + "and is" + ballColour);
    }
    public void setBallTexture() {
        ballTexture = "soft";
        System.out.println(ballColour);
    }


}

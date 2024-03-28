package task.task16b;

public class OverridingChild extends OverridingParent {
    public static void main(String[] args) {
        OverridingChild child = new OverridingChild();
        child.kitchen();
        child.room();

    }
    @Override
    public void kitchen() {
        System.out.println("i am the store place for food at home");

    }

    @Override
    public void room(){
        System.out.println("i a the resting place in the house");
    }
}

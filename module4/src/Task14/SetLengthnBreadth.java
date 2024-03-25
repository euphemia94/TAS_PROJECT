package Task14;

public class SetLengthnBreadth {
    public static void main(String[] args) {
        //to set length and breadth
        Square_shape shapeSid = new Square_shape();
        shapeSid.setShapeLength(9);
        int setLeng = shapeSid.getShapeLength();

        shapeSid.getShapeSides();

        shapeSid.setShapeBreadth(7);
        int setBread = shapeSid.getShapeBreadth();

        // Calculate area
        int area = shapeSid.getShapeLength() * shapeSid.getShapeBreadth();

        // Print out the final calculation
        System.out.println("The area of a square of length: " + setLeng +
                " and breadth " + setBread +
                " is " + area);


    }
}
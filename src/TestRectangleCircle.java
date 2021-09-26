public class TestRectangleCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle(1);
        System.out.println("A circle " + c1.toString());
        System.out.println("The color is " + c1.getColor());
        System.out.println("The radius is " + c1.getRadius());
        System.out.println("The area is " + c1.getArea());


        Rectangle r1 = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + r1.toString());
        System.out.println("The area is " + r1.getWidth());
    }



}

package Testing;
public class CircleTest {
    public static void main(String[] args) {

        //Syntax for creating new object in this case a circle from the circle class
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(25);
        Circle c3 = new Circle(125);
        Circle c4 = new Circle(225);

        System.out.println(c3.getPerimeter());
        System.out.println(c2.getPerimeter());

        System.out.println(c1.getPerimeter());
        c1.setRadius(22);
        System.out.println(c1.getPerimeter());

    }
}

public class RectangleTest {
    
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(2, 5);
        Rectangle r2 = new Rectangle(3, 6);
        Rectangle r3 = new Rectangle(4, 7);

        System.out.println(r1.getPerimeter());
        System.out.println(r2.getPerimeter());
        System.out.println(r3.getPerimeter());

        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
        System.out.println(r3.getArea());

        System.out.println(r1.diagonalLength());
        System.out.println(r2.diagonalLength());
        System.out.println(r3.diagonalLength());

        System.out.println(r3.length);
        System.out.println(r2.length);
        System.out.println(r1.length);
    }
}

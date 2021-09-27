public class TestTriangle {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(1, 1.5, 1, "yellow", true);
    System.out.println(t1.getArea());
    System.out.println(t1.getPerimeter());
    System.out.println(t1.getColor());
    System.out.println(t1.isFilled());
  }
}

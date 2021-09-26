public class Triangle extends GeometricObject {
  
  private double side1 = 0;
  private double side2 = 0;
  private double side3 = 0;

  Triangle(){

  }

  Triangle(double side1, double side2, double side3, String color, boolean filled){
    super.setColor(color);
    super.setFilled(filled);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public double getSide1() {
    return side1;
  }

  public double getSide2() {
    return side2;
  }

  public double getSide3() {
    return side3;
  }

  @Override
  public String getColor(){
    return super.getColor();
  }

  @Override
  public boolean isFilled(){
    return super.isFilled();
  }

  public double getArea(){
    double sides = (side1 + side2 + side3) / 2;
    double area = Math.sqrt(sides*(sides-side1)*(sides-side2)*(sides-side3));
    return area;
  }

  public double getPerimeter(){
    return (side1 + side2 + side3);
  }

  @Override
  public String toString() {
    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
  }
  
}

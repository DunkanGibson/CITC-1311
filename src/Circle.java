public class Circle extends GeometricObject{

    private double radius = 0;


    public Circle() {

    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getDiameter(){
        return radius * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

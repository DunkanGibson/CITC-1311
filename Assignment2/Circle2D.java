public class Circle2D {
    

    // Two double data fields named x and y that specify the center of the circle with get methods. 
    private double x;    
    private double y; 

    // A data field radius with a get method. 
    private double radius;

    // A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius. 
    Circle2D (){
        this(0, 0, 1);
    }

    // A constructor that creates a circle with the specified x, y, and radius.
    Circle2D (double newX, double newY, double newRadius){
        this.x = newX;
        this.y = newY;
        this.radius = newRadius;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }

    // A method getArea() that returns the area of the circle.
    public double getArea(){
        double area = (Math.PI * (radius * radius));
        return area;

    }

    // A method getPerimeter() that returns the perimeter of the circle.
    public double getPerimeter(){
        double perimeter = (Math.PI * Math.PI * radius);
        return perimeter;

    }

    // A method contains(double x, double y) that returns true if the specified point (x, y) is inside this circle.
    public boolean contains(double pointTestX, double pointTestY){

        if((pointTestX - this.x) * (pointTestX - this.x) + (pointTestY - this.y) * (pointTestY - this.y) <= radius * radius){
            return true;
        }else {
            return false;
        }
    }

    // A method contains(Circle2D circle) that returns true if the specified circle is inside this circle
    public boolean contains(Circle2D testCircle2D){
        if((Math.sqrt((testCircle2D.getX() - this.x) * (testCircle2D.getX() - this.x) + (testCircle2D.getY() - this.y) * (testCircle2D.getY() - this.y))) + testCircle2D.getRadius() > this.radius){
            return true;
        }else{
            return false;
        }
    }

   // A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle 
   public boolean overlaps(Circle2D testCircle2D){
    if((Math.sqrt((testCircle2D.getX() - this.x) * (testCircle2D.getX() - this.x) + (testCircle2D.getY() - this.y) * (testCircle2D.getY() - this.y))) < this.radius + testCircle2D.getRadius() ){
        return true;
    }else{
        return false;
    }
   }

}


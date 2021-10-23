public class Rectangle {
    private Point point;

    public Rectangle(Point p){
        point = p;
    }

    public int getWidth() {
        return point.getWidth();
    }

    public int getHeight(){
        return point.getHeight();
    }

    public float getArea(){
        return getWidth() * getHeight ();
    }

    public float getPerimeter(){
        return (getWidth() + getHeight()) * 2;
    }

    public void setPoint(Point p){
        point = p;
    }
}
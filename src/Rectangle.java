public class Rectangle extends GeometricObject {

    private double width = 0;
    private double height = 0;

    Rectangle(){

    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}

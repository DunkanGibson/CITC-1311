public class Rectangle {
    
    //State of the object, which is the data that makes up the object. In this case is a measuerment of length and width. 
    double length = 0;
    double width = 0;

    //Defauld constructor to create the object and initialze it.
    Rectangle () {

    }

    //Overload constructer to overload and change default value.
    Rectangle (double newLength, double newWidth){
        this.length = newLength;
        this.width = newWidth;
    }

    //Method to return the area of the rectangle
    double getArea (){
        return length * width;
    }

    //Method to return the perimeter of the rectangle
    double getPerimeter (){
        return 2 * (length * width);
    }

    //Method to return the diagonal length of the rectangle
    double diagonalLength (){
        return  Math.sqrt(((length *length) + (width * width)));
    }

    public void setLength (double newLength){
        this.length = newLength;
    }

    public void setWidth (double newWidth){
        this.width = newWidth;
    }

}

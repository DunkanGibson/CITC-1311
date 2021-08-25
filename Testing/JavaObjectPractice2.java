package Testing;
public class JavaObjectPractice2 {
    public static void main(String[] args) {
        Triange test = new Triange(2, 4, 7);

        System.out.println(test.getArea());
    }
}


class Triange {

    //Instance variable to declare the state.
    double side1 = 0;
    double side2 = 0;
    double side3 = 0;

    //default constructor
    Triange(){

    }

    //Constructor for intaking parameter and using them for calculation
    Triange(double newSide1, double newSide2, double newSide3){
        this.side1 = newSide1;
        this.side2 = newSide2;
        this.side3 = newSide3;
    }

    //Method for calculating the area of an triangle obj
    public double getArea(){ 
    return side1 + side2 + side3;
   } 


}

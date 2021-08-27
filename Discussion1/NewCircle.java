
public class NewCircle {

    int radius = 5;
    double pi = 3.1415;

    public static void main(String[] arg) {
        int k = radius;
        sum();
    }

    public void sum(){
        double val=perimeter(radius);
        System.out.println(val);
    }

    public double perimeter(int k) {
        return (double)(2 * pi * k);
    }
}

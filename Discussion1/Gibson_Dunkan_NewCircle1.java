
public class Gibson_Dunkan_NewCircle1 {

    int radius = 5;
    double pi = 3.1415;

    public static void main(String[] arg) {
        Gibson_Dunkan_NewCircle1 nc = new Gibson_Dunkan_NewCircle1();
        int k = nc.radius;
        nc.sum();
    }

    public void sum(){
        double val = perimeter(radius);
        System.out.println(val);
    }

    public double perimeter(int k) {
        return (double)(2 * pi * k);
    }
}


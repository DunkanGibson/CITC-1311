import java.util.*;

public class Discussion7 {
    

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.5);
        System.out.println(list.size());
        list.trimToSize();
        System.out.println(list.size());
        list.add(3.4);
        System.out.println(list.size());
        list.add(7.4);
        System.out.println(list.size());
        list.add(17.4);
        System.out.println(list.size());
    }
    
}

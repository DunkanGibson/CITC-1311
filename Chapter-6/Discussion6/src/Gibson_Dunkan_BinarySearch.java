import java.util.*;

public class Gibson_Dunkan_BinarySearch {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("yellow", "red", "green","blue");
        Collections.reverse(list);

        System.out.println("A list of integers in the array list:");

        //Collections.binarySearch is used to perform a binary search on list
        System.out.println("The result of a Binary Search for yellow in list is: " + Collections.binarySearch(list, "yellow"));

        System.out.println(list);


        List<String> list1 = Arrays.asList("yellow", "red", "green","blue");
        List<String> list2 = Arrays.asList("white","black");
        Collections.copy(list1,list2);

        //Collections.binarySearch is used to perform a binary search on list1
        System.out.println("The result of a Binary Search for black in list1 is: " + Collections.binarySearch(list1, "black"));

        System.out.println(list1);

        Collection<String> c1=Arrays.asList("red","cyan");
        Collection<String> c2=Arrays.asList("red","blue");

        Collection<String> c3=Arrays.asList("pink","tan");
        System.out.println(Collections.disjoint(c1,c2));

        System.out.println(Collections.disjoint(c1,c3));
        Collection<String> collection=Arrays.asList("red","cyan","red");
        System.out.println(Collections.frequency(collection,"red"));


        //Collections.binarySearch((List<String>) List, "Key"); used to perform a binary search on collections c1-c3
        System.out.println("The result of a Binary Search for red in c1 is: " + Collections.binarySearch((List<String>) c1, "red"));
        System.out.println("The result of a Binary Search for red in c2 is: " + Collections.binarySearch((List<String>) c2, "red"));
        System.out.println("The result of a Binary Search for pink in c3 is: " + Collections.binarySearch((List<String>) c3, "pink"));
    }
}

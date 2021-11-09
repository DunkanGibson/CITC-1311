
import java.util.*;

    public class Gibson_Dunkan_Sort {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("yellow", "red", "green","blue");
            Collections.reverse(list);

            System.out.println("A list of integers in the array list:");

            //Collections.sort used to sort list
            Collections.sort(list);
            System.out.println("The result of a sort for on list is: " + list);

            System.out.println(list);


            List<String> list1 = Arrays.asList("yellow", "red", "green","blue");
            List<String> list2 = Arrays.asList("white","black");
            Collections.copy(list1,list2);

            //Collections.sort used to sort list1
            Collections.sort(list1);
            System.out.println("The result of a sort for on list1 is: " + list1);
            System.out.println(list1);

            Collection<String> c1=Arrays.asList("red","cyan");
            Collection<String> c2=Arrays.asList("red","blue");

            Collection<String> c3=Arrays.asList("pink","tan");
            System.out.println(Collections.disjoint(c1,c2));

            //Collections.sort(List<String>) used to sort collections c1-c3
            Collections.sort((List<String>) c1);
            Collections.sort((List<String>) c2);
            Collections.sort((List<String>) c3);
            System.out.println("The result of a sort for on c1 is: " + c1);
            System.out.println("The result of a sort for on c2 is: " + c2);
            System.out.println("The result of a sort for on c3 is: " + c3);

            System.out.println(Collections.disjoint(c1,c3));
            Collection<String> collection=Arrays.asList("red","cyan","red");
            System.out.println(Collections.frequency(collection,"red"));

        }
    }


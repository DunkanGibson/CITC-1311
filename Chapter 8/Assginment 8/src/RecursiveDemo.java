import java.util.*;

public class RecursiveDemo
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input;

        System.out.print("Please enter a string: ");

        input = scanner.nextLine();

        Stack<Character> stk = new Stack<>();

        Queue<Character> que = new LinkedList<>();

        for(int i = 0; i < input.length(); i++){
            stk.push(input.charAt(i));
            que.add(input.charAt(i));
        }

        System.out.println("The reverse of the string is: ");

        Recursive.prt_chars_rev_rec(stk);

        System.out.println("The string is: ");
        Recursive.prt_chars_rec(que);

        int numberOfElements;
        System.out.print("Please enter the number of elements in the array: ");

        numberOfElements = scanner.nextInt();

        int[] arrayOfElements = new int[numberOfElements];

        System.out.print("Enter the numbers that are in the array: ");
        for(int i = 0; i <numberOfElements; i++){
            arrayOfElements[i] = scanner.nextInt();
        }

        Stack<Integer> intStk = new Stack<>();
        for(int i = 0; i < numberOfElements; i++)
        {
            intStk.push(arrayOfElements[i]);
        }
        System.out.println("This is the sum of the squares of the elements in the stack: " + Recursive.sum_sqr_rec(intStk));
        for(int i = 0; i < numberOfElements; i++)
        {
            intStk.push(arrayOfElements[i]);
        }
        System.out.println("This is the sum of the elements in the stack: " + Recursive.plus_minus_rec(intStk));

    }

}


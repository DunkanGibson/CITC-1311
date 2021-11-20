import java.util.*;

public class PEX7 {

    public static void main(String[] args) {

        String keepGoing = "Y";
        Scanner scanner = new Scanner(System.in);



        while (keepGoing.equalsIgnoreCase("Y")){
            boolean palindrome = true;
            GenericStack gs = new GenericStack();
            GenericQueue gq = new GenericQueue();
            System.out.print("Please enter a string to evaluated: ");
            String input = scanner.nextLine();

            for (int i = 0; i < input.length(); i++) {
                gs.push(input.charAt(i));
                gq.enqueue(input.charAt(i));
            }

            for (int j = 0; j < gs.getSize(); j++){
                if(!gs.pop().equals(gq.dequeue())){
                    palindrome = false;
                }
            }

            if (palindrome) {
                System.out.println("The string you entered is a palindrome");
            } else {
                System.out.println("The string you entered is not a palindrome");
            }

            System.out.println("Do you want to keep going? (Y for yes N for no)");
            keepGoing = scanner.nextLine();
        }
    }
}

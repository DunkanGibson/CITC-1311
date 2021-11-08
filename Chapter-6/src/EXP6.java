import java.util.*;

public class EXP6 {

    static char symbol;
    static int place;

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String a = "{(0+1)*(2+3)}";
            String b = "{(0+1)+[4*(2+3)]}";
            String c = "{(0+1)+[4*(2+3)}}";

            for (int i = 0; i < 3; i++) {
                System.out.print("Enter your expression: ");

                String input = scanner.nextLine();

                if (isItBalanced(input)){
                    System.out.println("Expected output: " + input + " == 1");
                }else {
                    System.out.println("Mismatch found: " + symbol + " at " + place);
                    System.out.println("Expected output: " + input + " == 0");
                }
            }

        }

        public static boolean isItBalanced(String inputExpr) {

            Stack<Character> expStack = new Stack<Character>();

                for(int i = 0; i < inputExpr.length(); i++){

                    symbol = inputExpr.charAt(i);
                    place = i;

                    if (inputExpr.charAt(i) == '{' || inputExpr.charAt(i) == '(' || inputExpr.charAt(i) == '[' ) {
                        expStack.push(inputExpr.charAt(i));
                    } else if(inputExpr.charAt(i) == '}') {
                        if(!expStack.isEmpty() && expStack.peek() == '{') {
                            expStack.pop();
                        }else {
                            return false;
                        }
                    } else if (inputExpr.charAt(i) == ')') {
                        if(!expStack.isEmpty() && expStack.peek() == '(') {
                            expStack.pop();
                        } else {
                            return false;
                        }
                    } else if(inputExpr.charAt(i) == ']'){
                        if(!expStack.isEmpty() && expStack.peek() == '[') {
                            expStack.pop();
                        } else {
                            return false;
                        }
                    }
                }

                if(expStack.isEmpty()) {
                    return true;
                } else {
                    return false;
                }
        }
    }


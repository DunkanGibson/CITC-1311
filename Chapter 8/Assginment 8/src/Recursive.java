import java.util.*;


public class Recursive {

        static public int sum_sqr_rec(Stack<Integer> stk)
        {
            if(stk.isEmpty()) {
                return 0;
            }
            else{
                int stackElement = stk.peek();
                stk.pop();
                return (stackElement * stackElement) + sum_sqr_rec(stk);
            }

        }

        static public int plus_minus_rec(Stack<Integer> stk)
        {
            if(stk.isEmpty()){
                return 0;
            }
            else{
                int count = stk.size();
                int stackElement = stk.peek();
                stk.pop();
                if(count % 2 == 0)
                    return stackElement - plus_minus_rec(stk);
                else
                    return stackElement + plus_minus_rec(stk);
            }

        }

        static public void prt_chars_rev_rec(Stack<Character> stk)
        {
            if(stk.isEmpty()) {

            }
            else{
                char stackElement = stk.pop();
                System.out.println(stackElement + " ");
                prt_chars_rev_rec(stk);
            }
        }

        static public void prt_chars_rec(Queue<Character> que)
        {
            if(que.isEmpty()) {

            }
            else{
                char queElement = que.remove();
                System.out.println(queElement + " ");
                prt_chars_rec(que);
            }
        }

    }


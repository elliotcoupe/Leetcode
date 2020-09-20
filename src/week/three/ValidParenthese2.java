package week.three;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthese2 {
    public static void main(String[] args){
        String testcase = "(((()()()()()()***";
        System.out.println(testcase + " is : " + checkValid(testcase) );
    }
    /*
    What I learnt in the question is that, we can use charAt to make the code more elegant
    In the static function. Var is not very traceable.
    The static methos cannot access the value of an instance var(By definition, it undefined until and instance of the object is created;
     */
    public static boolean checkValid(String s){
       Stack<Integer> open = new Stack<>();
       Stack<Integer> star = new Stack<>();
       for(int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == '(')
               open.push(i);
           else if (s.charAt(i) == '*')
               star.push(i);
           else {
               if (!open.empty())
                   open.pop();
               else if (!star.empty())
                   star.pop();
               else
                   return false;
           }
       }

       while(!open.empty()){
           if(star.empty())
               return false;
           else if(open.pop()>star.pop())
               return false;
       }
       return true;
    }
}

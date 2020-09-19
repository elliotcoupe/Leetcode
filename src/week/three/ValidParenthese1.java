package week.three;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthese1 {
    public static void main(String[] args){
        String testcase = "()(){}{{[[]]}}";
        System.out.println(testcase + " is : " + checkValid(testcase) );
    }
    public static boolean checkValid(String s){
        char[] chars = s.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        //The most tricky thing in this is how to arrange the
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        Stack<Character> stack = new Stack();
        for(char c : chars){
            if(!map.containsKey(c))
                stack.push(c);
            else{
                if(stack.empty())
                    return false;
                else if (map.get(c) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.empty()?true:false;
    }
}

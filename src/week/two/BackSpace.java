package week.two;

import java.util.Stack;

public class BackSpace {
    public static void main(String[] args){
        String str1 = "a#asd";
        String str2 = "##ae#sd";
        String str3 = "###aesd";
        System.out.println("1 = 2 ? " +  backspaceCompare(str1, str2));
        System.out.println("2 = 3 ? " +  backspaceCompare(str2, str3));

    }
    public static boolean backspaceCompare(String S, String T){
        return getStack(S).equals(getStack(T));
    }

    public static Stack getStack(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c : chars){
            if(c!='#')
                stack.push(c);
            else if(!stack.empty())
                stack.pop();
        }
        return stack;
    }
}

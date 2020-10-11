package Oct.Week2;

import java.util.Iterator;
import java.util.Stack;

public class RemoveDuplicate {
    public static void main(String[] args){
        String testcase = "bcabc";
        System.out.println("Result: " +  removeDuplicateLetters(testcase));
    }
    public static String removeDuplicateLetters(String s){
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            count[c-'a'] += 1;
        }
        for(char c:s.toCharArray()){
            count[c-'a'] -= 1;
            while(!stack.empty() && !visited[c-'a'] && stack.peek() > c && count[stack.peek()-'a'] >0 ){
                visited[stack.pop() - 'a'] = false;
            }
            if(!visited[c-'a']) {
                stack.push(c);
                visited[c - 'a'] = true;
            }
        }

        Iterator<Character> iter = stack.iterator();
        StringBuilder sb = new StringBuilder();
        while(iter.hasNext()){
            sb.append(iter.next());
        }
        return sb.toString();
    }
}

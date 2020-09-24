package Sept.Week4;

import java.util.Arrays;

public class FindDifference {
    public static void main(String[] args){
        String s = "abcd";
        String t = "abcde";
        System.out.println("The different character is " + findDifference(s, t));
    }
    public static char findDifference(String s, String t){
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        for(int i = 0; i < t.length(); i++){
            if(i == t.length()-1)
                return T[i];
            else if(S[i] != T[i]){
                return T[i];
            }
        }
        return ' ';

    }
}

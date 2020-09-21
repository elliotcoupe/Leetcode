package week.four;
import java.util.Arrays;

public class LongestSubSequence {
    public static void main(String[] args){
        String[] testcase = new String[]{"abcde", "ace"};
        System.out.println("Longest: " + longestCommonSubsequence(testcase[0], testcase[1]));
    }

    static int longestCommonSubsequence(String text1, String text2) {
        int[][] result = new int[text1.length()][text2.length()];

        // Get clear why we should find the largest when they are not equals
        for(int i = 0; i < text1.length(); i++){
            for(int j = 0; j < text2.length(); j++){
                if(text1.charAt(i) == text2.charAt(j)){
                    if(i==0 || j== 0)
                        result[i][j] = 1;
                    else
                        result[i][j] = result[i-1][j-1] + 1;
                }else{
                    result[i][j] = Math.max( (i==0?0:result[i-1][j]) ,(j==0?0:result[i][j-1]) );
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
        return result[text1.length()-1][text2.length()-1];
    }
}

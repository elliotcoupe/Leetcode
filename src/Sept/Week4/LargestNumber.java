package Sept.Week4;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNumber {
    public static void main(String[] args){
        int[] testcase = new int[]{1,2 ,4 ,4};
        System.out.println("Largest number is: " + largestNumber(testcase));
    }
    public static String largestNumber(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: nums) list.add(num);
        Collections.sort(list, (a, b )->{
            String n1 = String.valueOf(a);
            String n2 = String.valueOf(b);
            return (n2+n1).compareTo(n1 + n2);
        });
        StringBuilder ans = new StringBuilder();
        for(int num:list) ans.append(num);
        while(ans.length()>1 && ans.charAt(0) == '0')
            ans.deleteCharAt(0);
        return ans.toString();
    }
}

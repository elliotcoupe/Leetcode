package Oct.Week1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KdiffPairs {
    public static void main(String[] args){
        int[] testcase = new int[]{1,2,4,4,3,3,0,9,2,3};
        System.out.println("Number of pairs " + findPiars(testcase, 3));
    }
    public static int findPiars(int[] nums, int k){
        Arrays.sort(nums);
        Set<Integer> unique = new HashSet<Integer>();
        Set<String> pairs = new HashSet<>();
        for(int i : nums){
            if(unique.contains(i-k))
                pairs.add(i-k + ":" + i);
            unique.add(i);
        }
        return pairs.size();
    }
}

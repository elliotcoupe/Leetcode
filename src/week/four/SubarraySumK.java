package week.four;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {
    public static void main(String[] args){
        int[] testcase = new int[]{1, 1, 1};
        SubArrayK sak = new SubArrayK();
        System.out.println("Result: " + sak.getTotal(testcase, 2));
    }

}

class SubArrayK{

     int getTotal(int[] nums, int k){
        //System.out.println(null.length);
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, sum = 0;
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int remain = sum - k;
            if(map.containsKey(remain))
                count += map.get(remain);
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum) +1);
            }else{
                map.put(sum, 1);
            }
        }
        // get to a debt pay off culculator
        return count;
    }
}
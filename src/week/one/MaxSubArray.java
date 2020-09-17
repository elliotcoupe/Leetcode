package week.one;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args){
        List<MaxArrayCase> testcases = new ArrayList<>();
        testcases.add(new MaxArrayCase(new int[]{1}, 1));
        testcases.add(new MaxArrayCase(new int[]{2,-1,-1,3}, 3));
        testcases.add(new MaxArrayCase(new int[]{1,-1,1}, 1));
        for(MaxArrayCase c : testcases){
            System.out.println("TESTCASE: " + Arrays.toString(c.arr));
            int result = maxSubArray(c.arr);
            System.out.println("RESULT: " + result + (result == c.result?" PASSED\n" : " FAILED\n"));
        }
    }
    // Kadane's Algorithms

    public static int maxSubArray(int[] nums){
        int size = nums.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for(int i = 0; i< size; i++){
            max_ending_here = max_ending_here + nums[i];
            if(max_so_far <  max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }

        return max_so_far;
    }
}

class MaxArrayCase{
    int[] arr;
    int result;
    MaxArrayCase(int[] arr, int result){
        this.arr = arr;
        this.result = result;
    }
}

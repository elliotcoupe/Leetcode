package week.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args){
        List<ArrayZeros> testcases = new ArrayList<>();
        testcases.add(new ArrayZeros(new int[]{1,2,3,0,1},new int[]{1,2,3,1,0}));
        testcases.add(new ArrayZeros(new int[]{0,2,3,0,1},new int[]{2,3,1,0,0}));
        for(ArrayZeros c : testcases){
            System.out.println("TESTCASE: " + Arrays.toString(c.value));
            moveZeros(c.value);
            System.out.println("RESULT  : " + Arrays.toString(c.value) + (Arrays.equals(c.value, c.result)?" Passed\n":" Failed\n"));
        }
    }
    static void moveZeros(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count>0 ){
                nums[i-count] = nums[i];
            }
            if(nums[i] == 0){
                count ++;
            }else if(i+count >= nums.length){
                nums[i] = 0;
            }
        }
//        for(int i =0; i<count; i++){
//            nums[nums.length - i- 1] = 0;
//        }
    }
}

class ArrayZeros{
    int[] value;
    int[] result;
    public ArrayZeros(int[] value, int[] result){
        this.value = value;
        this.result = result;
    }
}


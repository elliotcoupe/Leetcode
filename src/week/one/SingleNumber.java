package week.one;

import java.util.*;

public class SingleNumber<l1> {
    public static void main(String[] args){
        List<TestPair> testCases = new ArrayList<>();
        testCases.add(new TestPair(1, new int[]{1,2,2}));
        testCases.add(new TestPair(2, new int[]{1,2,1}));
        testCases.add(new TestPair(1, new int[]{1,3,3,2,2}));
        testCases.add(new TestPair(2, new int[]{3,2,3}));
        Solution solution = new Solution();
        for(TestPair pair : testCases){
            System.out.println("TESTCASE: " + Arrays.toString(pair.list) );
            int result = solution.singleNumber(pair.list);
            System.out.println("RESULT: " + result + (result==pair.result ? " Passed\n" : " Failed\n"));
        }
    }


}

class TestPair{
    int result;
    int[] list;
    TestPair(int result, int[] list){
        this.result = result;
        this.list = list;
    }

}

class Solution {
    public int singleNumber(int[]  nums){
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }
        return (int)set.toArray()[0];
    }
}

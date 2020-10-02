package Oct.Week1;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args){
        int[] testcase = new int[]{2, 3, 6, 7};
        System.out.println(combinationSum(testcase, 7));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        util(candidates, target, 0, new ArrayList<>(), res);
        return res;
     }

    public static void util(int[] candidates, int target, int index, List<Integer> temp, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(temp));
        }
        for(; index<candidates.length&&target >0; index++){
            temp.add(candidates[index]);
            util(candidates,target-candidates[index],index,temp,res);
            temp.remove(temp.size()-1);
        }
    }
}

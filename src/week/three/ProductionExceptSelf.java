package week.three;

public class ProductionExceptSelf {
    public static void main(String[] args){
        int[] testcase = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("Result: " + getProduction(testcase));
    }

    public static int[] getProduction(int[] nums){
        int[] res = new int[nums.length];
        //Apply the production of the Procudtion of Prefixes, use temp to accumulate
        for(int temp =1, i = 0; i< nums.length; i++){
            res[i] = temp;
            temp+= nums[i];
        }
        //Apply the production of the Procudtion of Suffix, use temp to accumulate
        for(int i= nums.length-1, temp=1; i>=0; i--){
            res[i] *= temp;
            temp *= nums[i];
        }
        return res;
    }
}

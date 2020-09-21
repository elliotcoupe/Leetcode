package week.four;

public class JumpGame {
    public static void main(String[] args){
        int[] testcase = new int[]{2, 3, 1, 1, 4};
        System.out.println("Can jump to the end : " + canJump(testcase));
    }
    static boolean canJump(int[] nums){
        // reversed is
        if(nums.length < 2) return true;
        int loc = nums.length - 1;
        int start = nums.length - 1;
        while(start >= 0){
            if(loc-start <= nums[start]){
                loc = start;
                if(start == 0) return true;
            }
            start-- ;
        }
        return false;
    }
}

// Greedy algorithm

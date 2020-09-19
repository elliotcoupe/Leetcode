package week.test;

public class BinaraySearch {

    public static void main(String[] args){
        int[] testcase = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println("The index of 3 is " + bs(testcase, 0, testcase.length,3));
    }
    public static int bs(int[] nums, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            System.out.println("Start: " + start + " Mid: " + mid + " End: " + end);
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target){
                end = mid -1;
                // if we are trying to find an 2 between 1 and 3. The start will be 2 and the end will be 1, which finally end the loop
            }else
                start = mid+1;
        }
        return -1;
    }
}

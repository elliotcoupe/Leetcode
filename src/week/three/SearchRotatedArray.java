package week.three;

public class SearchRotatedArray {

    public static void main(String[] args){
        int[] testcase = new int[]{ 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7};
        System.out.println("Index of 9: " + searchArray(testcase, 9));
    }

    public static int searchArray(int[] nums, int target){
        if(nums == null)
            return -1;
        if(nums.length == 1 && nums[0] == target)
            return 0;
        if(nums.length == 1 && nums[0] != target){
            return -1;
        }
        if(nums[0] < nums[nums.length-1])
            return bs(nums, target, 0, nums.length -1);
        int pivot = findPivot(nums, 0, nums.length-1);
        if(target > nums[pivot] && target <= nums[nums.length -1])
            return bs(nums, target, pivot, nums.length -1 );
        else
            return bs(nums, target,0, pivot -1);
    }
    public static int bs(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target)
                return mid;
            else if(target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static int findPivot(int[] nums, int low, int high){
        int mid = low + (high - low)/2;
        if(nums[mid] > nums[high] && (mid + 1) == high)
            return high;
        if(nums[mid] < nums[low] && (low + 1) == mid)
            return mid;
        if(nums[low] > nums[mid])
            return findPivot(nums, low, mid);
        else
            return findPivot(nums, mid, high);
    }
}

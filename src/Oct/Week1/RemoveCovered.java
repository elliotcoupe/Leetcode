package Oct.Week1;

import java.util.Arrays;
import java.util.Collections;

public class RemoveCovered {
    public static void main(String[] args){
        int[][] testcase = {{1,4}, {2,3},{3,4}};
        System.out.println("Count " + getCount(testcase));

    }
    public static int getCount(int[][] intervals){
        if(intervals.length <=1)
            return intervals.length;
        Arrays.sort(intervals, (a, b)->a[0] == b[0]? b[1]-a[1]:a[0]-b[0]);
        int count = 1;
        int[] prev = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            int[] curr = intervals[i];
            if(prev[0]<=curr[0] && prev[1]>=curr[1])
                continue;
            count++;
            prev = curr;
        }
        return count;
    }
}

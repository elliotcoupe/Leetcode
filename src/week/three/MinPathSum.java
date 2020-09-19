package week.three;

public class MinPathSum {
    public static void main(String[] args){

        int[][] testcase = new int[18][];
        testcase[0] =  new int[]{3,8,6,0,5,9,9,6,3,4,0,5,7,3,9,3};
        testcase[1] =  new int[]{0,9,2,5,5,4,9,1,4,6,9,5,6,7,3,2};
        testcase[2] =  new int[]{8,2,2,3,3,3,1,6,9,1,1,6,6,2,1,9};
        testcase[3] =  new int[]{1,3,6,9,9,5,0,3,4,9,1,0,9,6,2,7};
        testcase[4] =  new int[]{8,6,2,2,1,3,0,0,7,2,7,5,4,8,4,8};
        testcase[5] =  new int[]{4,1,9,5,8,9,9,2,0,2,5,1,8,7,0,9};
        testcase[6] =  new int[]{6,2,1,7,8,1,8,5,5,7,0,2,5,7,2,1};
        testcase[7] =  new int[]{8,1,7,6,2,8,1,2,2,6,4,0,5,4,1,3};
        testcase[8] =  new int[]{9,2,1,7,6,1,4,3,8,6,5,5,3,9,7,3};
        testcase[9] =  new int[]{0,6,0,2,4,3,7,6,1,3,8,6,9,0,0,8};
        testcase[10] = new int[]{4,3,7,2,4,3,6,4,0,3,9,5,3,6,9,3};
        testcase[11] = new int[]{2,1,8,8,4,5,6,5,8,7,3,7,7,5,8,3};
        testcase[12] = new int[]{0,7,6,6,1,2,0,3,5,0,8,0,8,7,4,3};
        testcase[13] = new int[]{0,4,3,4,9,0,1,9,7,7,8,6,4,6,9,5};
        testcase[14] = new int[]{6,5,1,9,9,2,2,7,4,2,7,2,2,3,7,2};
        testcase[15] = new int[]{7,1,9,6,1,2,7,0,9,6,6,4,4,5,1,0};
        testcase[16] = new int[]{3,4,9,2,8,3,1,2,6,9,7,0,2,4,2,0};
        testcase[17] = new int[]{5,1,8,8,4,6,8,5,2,4,1,6,2,2,9,7};
        //Brute force is to time consuming for this case. We should do it wisely.
        System.out.println("The min path value is " + solution(testcase));
    }
    public static int solution(int[][] grid ){
        // This wisdom about his function is that we don't need to loop the matrix in the specific with
        // we can't check them row by row and line by line
        // we only need to make the dicision from the left and the line above, which is already produced in this loop
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 1; i < m; i++)
            grid[i][0] = grid[i-1][0] + grid[i-i][0];
        for(int i = 1; i < n; i++)
            grid[0][i] = grid[0][i-1] + grid[0][i];

        for(int i = 1; i < m ; i++){
            for(int j = 1; j < n; j++){
                grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j];
            }
        }
        return grid[m-1][n-1];
    }
}

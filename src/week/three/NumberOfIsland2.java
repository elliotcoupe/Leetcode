package week.three;

public class NumberOfIsland2 {
    public static void main(String[] args){
        /*
        This solution is Consist of two parts:
        Part1: Iterate the grid find "1" and add the count
        Part2: When find and "1", apply BFS to set all connected "1" to zero

         */
        char[][] testcase = new char[4][];
        testcase[0] = new char[]{'1','1','1','1','0'};
        testcase[1] = new char[]{'1','1','0','1','0'};
        testcase[2] = new char[]{'1','1','0','0','0'};
        testcase[3] = new char[]{'0','0','0','0','0'};

        System.out.println("Number of island is: " + solution(testcase));
    }
    static int solution(char[][] grid){
        int count = 0;

        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count ++;
                    applyDFS(grid,  i, j);
                }

            }
        }
        return count;
    }

    static void applyDFS(char[][] grid, int i, int j){
        grid[i][j] = '0';
        if(checkPoint(grid, i-1, j))
            applyDFS(grid, i-1, j);
        if(checkPoint(grid, i, j-1))
            applyDFS(grid, i, j-1);
        if(checkPoint(grid, i + 1, j))
            applyDFS(grid, i+1, j);
        if(checkPoint(grid, i, j + 1))
            applyDFS(grid, i, j+1);

    }

    static boolean checkPoint(char[][] grid, int i, int j){
        if(i<0 || j< 0|| i>= grid.length || j >= grid[0].length )
            return false;
        if(grid[i][j] == '1')
            return true;
        return false;
    }
}

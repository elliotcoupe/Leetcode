package week.three;

public class NumberOfIsland {
    public static void main(String[] args){
        /*
        This solution is Consist of two parts:
        Part1: Iterate the grid find "1" and add the count
        Part2: When find and "1", apply BFS to set all connected "1" to zero

         */
        String[][] testcase = new String[4][];
        testcase[0] = new String[]{"1","1","1","1","0"};
        testcase[1] = new String[]{"1","1","0","1","0"};
        testcase[2] = new String[]{"1","1","0","0","0"};
        testcase[3] = new String[]{"0","0","0","0","0"};

        System.out.println("Number of island is: " + solution(testcase));
    }

    static int solution(String[][] grid){
        int m = grid.length;
        if(grid == null || m == 0) // the second part of this function is only called when the first part was false
            return 0;
        int n = grid[0].length;

        int count = 0;
        boolean[][] isVisited = new boolean[m][n];
        //Loop the grid
        for(int i = 0; i<m; i++){
            for(int j = 0; j < n; j++){
                if("1".equals(grid[i][j]) && !isVisited[i][j]){
                    // add when
                    isVisited[i][j] = true;
                    count++;
                    // then set all connected to 0
                    applyDFS(grid, i, j, isVisited);
                }
                isVisited[i][j] = true;
            }
        }
        return count;
    }

    static void applyDFS(String[][] grid, int i, int j, boolean[][] isVisited){
        if(isPathPresent(grid, i+1, j, isVisited))
            applyDFS(grid, i+1, j, isVisited);
        if(isPathPresent(grid, i, j+1, isVisited))
            applyDFS(grid, i, j+1, isVisited);
        if(isPathPresent(grid, i-1, j, isVisited))
            applyDFS(grid, i-1, j, isVisited);
        if(isPathPresent(grid, i, j-1, isVisited))
            applyDFS(grid, i, j-1, isVisited);
    }

    static boolean isPathPresent(String[][] grid, int i, int j, boolean[][] isVisited){
        if(i>=0 && i < grid.length && j>= 0 && j < grid[0].length && !isVisited[i][j]){
            isVisited[i][j] = true;
            if("1".equals(grid[i][j]))
                return true;
        }
        return false;
    }
}

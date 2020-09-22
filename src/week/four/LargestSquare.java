package week.four;

public class LargestSquare {
    public static void main(String[] args){
        int testcase[][] = { {1, 0, 1, 0 ,0} , { 1, 0 , 1, 1 ,1} , { 1, 1, 1, 1 ,1}, { 1, 0, 0, 1 ,1} };

        System.out.println("The result for testcase is " + maximalSquare(testcase));

    }

    public static int maximalSquare(int[][] matrix) {
        int max = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 1 ){
                    int count = 1;
                    while(i+count< matrix.length && j + count < matrix[0].length ){
                        if(!checkValid(matrix,i, j,count)) break;
                        count++;
                    }
                    if(count > max) max = count;
                }
            }
        }
        return max*max;
    }

    public static boolean checkValid(int[][] matrix, int x, int y, int count){
        for(int i = 0; i<= count; i++){
            if(matrix[x+count][y+i] != 1) return false;
            if(matrix[x+i][y+count] != 1) return false;
        }
        return true;
    }
}

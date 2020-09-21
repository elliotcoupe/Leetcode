package week.four;

public class BitsiwseAndOfNums {
    public static void main(String[] args){
        int[] testcase = new int[]{5, 7};
        System.out.println("Result of " + testcase[0] + " & " + testcase[1] +" = " + rangeBitwiseAnd(testcase[0], testcase[1]) );
    }
    public static int rangeBitwiseAnd(int m , int n){

        // get some intance, find something
        int count = 0;
        while(m != n){
            m >>=1;
            n >>=1;
            count++;
        }
        return m<<count;
    }
}

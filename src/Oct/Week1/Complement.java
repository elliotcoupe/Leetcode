package Oct.Week1;

public class Complement {
    public static void main(String[] args){
        System.out.println("Complemnt of 5 is: " + getComplement(5));
    }

    public static int getComplement(int N){
        if(N==0)
            return 1;
        int complemnt = 0, digit = 0;
        while(N!=0){
            complemnt += (1 - N%2)*Math.pow(2, digit);
            N/=2;
            digit++;
        }
        return complemnt;
    }
}

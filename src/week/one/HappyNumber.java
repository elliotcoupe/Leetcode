package week.one;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class HappyNumber {
    public static void main(String[] args) {
        List<HappyCase> testcases = new ArrayList<>();
        testcases.add(new HappyCase(1, true));
        testcases.add(new HappyCase(100, true));
        testcases.add(new HappyCase(86, true));
        for(HappyCase c : testcases){
            System.out.println("TESTCASE: " + c.value);
            boolean result = isHappy(c.value);
            System.out.println("RESULT: " + result + (result==c.result ? " Passed\n":" Failed\n"));
        }
    }

    static boolean isHappy(int n){
        Set<Integer> set = new HashSet<>();
        boolean flag = true;
        int m;
        while(flag){
            set.add(n);
            m = 0;
            while(n != 0){
                m += (n%10)*(n%10);
                n = n/10;
            }
            if(m==1){
                return true;
            }else if(set.contains(m)){
                return false;
            }
            n = m;
        }
        return false;
    }
}

class HappyCase{
    int value;
    boolean result;
    HappyCase(int value, boolean result){
        this.value = value;
        this.result = result;
    }
}



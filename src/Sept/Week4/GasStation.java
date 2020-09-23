package Sept.Week4;

import java.util.Arrays;

public class GasStation {
    public static void main(String[] args){
        int[] gas = new int[]{5,1,2,3,4};
        int[] cost = new int[]{4,4,1,5,1};
        System.out.println("The end stop will be: " + canCompleteCircuit(gas, cost));
    }
    // Read the question carefully, make sure you know what to do with that
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int[] net = new int[gas.length];
        int start = -1;
        for(int i = 0; i <cost.length; i++){
            net[i] = gas[i] - cost[i];
        }
        for(int i = 0; i < net.length; i++){
            if(net[i] >=0){
                int remain = canReturn(i, net);
                if(remain >=0) return i;
            }
        }
        return -1;
    }

    public static int canReturn(int start, int[] net){
        int remain = 0;
        for(int i = start; i< net.length; i++){
            remain += net[i];
            if(remain < 0)
                return remain;
        }
        for(int i = 0; i < start; i++){
            remain+= net[i];
            if(remain < 0)
                return remain;
        }
        return start;
    }

}

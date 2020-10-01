package Oct.Week1;

import java.util.LinkedList;

public class NumberOfRecentCall {
    public static void main(String[] args){
        int[] tescase  = new int[]{1, 100, 3001, 3002};
        RecentCounter rc = new RecentCounter();
        for(int i : tescase){
            System.out.println(rc.ping(i));
        }
    }
}

class RecentCounter{
    LinkedList<Integer> recent;

    public RecentCounter(){
        recent = new LinkedList<>();
    }
    public int ping(int t){
        recent.add(t);
        int first = recent.getFirst();
        while(t > first + 3000){
            recent.removeFirst();
            first = recent.getFirst();
        }
        return recent.size();
    }
}

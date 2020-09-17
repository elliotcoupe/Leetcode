package week.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStone {
    public static void main(String arg[]){

    }
    public static int lastStoneWeight(int[] stones){
        List<Integer> list = new ArrayList<>();
        for(int s : stones)
            list.add(s);
        while(list.size() > 1){
            Collections.sort(list);
            int first = list.get(list.size() -1 );
            int second = list.get(list.size() - 2);
            //list.remove(list.size())
        }
        return 0;
    }
}

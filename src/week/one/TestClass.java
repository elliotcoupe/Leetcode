package week.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TestClass {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(8);
        while(list.size()>1){
            Collections.sort(list);
            int first = list.get(list.size()-1);
            int second = list.get(list.size()-2);
            list.remove(list.size()-1);
            list.remove(list.size()-1);
            if( second > 1)
                System.out.println(first-second);
                list.add(first-second);
            System.out.println(list);
        }

    }
}

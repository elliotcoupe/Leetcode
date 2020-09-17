package week.one;
import java.util.*;

public class Anograms {
    public static void main(String[] args){
        List<String[]> testcases = new ArrayList<> ();
        testcases.add(new String[]{"abc", "bac", "a", "c"});
        for(String[] c: testcases){
            System.out.println("TESTCASE: " + Arrays.toString(c));
            List<List<String>> result = groupAnagrams(c);
            System.out.println("RESULT:");
            for(List s : result)
                System.out.println(s);
            System.out.println("\n");
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        if(strs.length == 0)
            return new ArrayList<>();
        Map<String, List> map = new HashMap<>();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!map.containsKey(key))
                map.put(key, new ArrayList());
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}

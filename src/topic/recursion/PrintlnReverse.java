package topic.recursion;

public class PrintlnReverse {
    public static void main(String[] args){
        String str = "Hello the fall";
        char[] testcase = str.toCharArray();
        System.out.print("The reveres is: ");
        reverse(0, testcase);
    }
    public static void reverse(int index, char[] s){
        if(s == null || index >= s.length ){
            return;
        }
        reverse(index + 1, s);
        System.out.print(s[index]);
    }
}

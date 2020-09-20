package week.test;

public class TestJava {
    public static void main(String[] args){
        testLoop();
    }

    public static void testLoop(){
        /*
        There is no differnce between using ++i and using i++ in the loop
         */
        for(int i= 0; i< 5;++i)
            System.out.println(i);
    }
}

package Sept.Week4;

public class TeemoAttack {
    public static void main(String[] args){
        int[] testcase = new int[]{1,2,3};
        int duration = 2;
        System.out.println("Total duration is " + getTime(testcase, duration));
    }
    public static int getTime(int[] times, int duration){
        if(times.length==0)
            return 0;
        if(times.length == 1)
            return duration;
        int sum = 0;
        for(int i = 1 ; i < times.length; i++){
            if(times[i]-times[i-1] > duration){
                sum+=duration;
            }else{
                sum+=(times[i]-times[i-1]);
            }
        }
        return sum+duration;
    }
}

package week.one;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BestTimeBuy {
    public static void main(String[] args){
        List<SharePrice> testcases = new ArrayList<>();
        testcases.add(new SharePrice(new int[]{1,2}, 1));
        testcases.add(new SharePrice(new int[]{1}, 0));

        testcases.add(new SharePrice(new int[]{4, 3, 3, 1}, 0));
        testcases.add(new SharePrice(new int[]{1, 2, 1, 3, 4, 5}, 5));
        for(SharePrice c : testcases){
            System.out.println("TESTCASE: " +  Arrays.toString(c.prices));
            int profit = maxProfit(c.prices);
            System.out.println("OUTPUT:   " +  profit + (profit == c.profit ? " Passed.\n": " Failed.\n"));
        }
    }

    public static int maxProfit(int[] prices){
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while(i < prices.length -1 ){
            while (i < prices.length - 1 && prices[i] >= prices[i+1])
                i++;
            valley = prices[i];
            while (i < prices.length -1 && prices[i] <= prices[i+1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
        //return calculate(prices, 0);

    }

    public static int calculate(int[] prices, int s){
        if(s >= prices.length)
            return 0;
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            int maxprofit = 0;
            for(int i = start + 1; i < prices.length; i++){
                if(prices[start] < prices[i]){
                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
                    if( profit > maxprofit){
                        maxprofit = profit;
                    }
                }
            }
            if(maxprofit > max)
                max = maxprofit;
        }
        return max;

    }
}

class SharePrice{
    int[] prices;
    int profit;
    SharePrice(int[] prices, int profit){
        this.prices = prices;
        this.profit = profit;
    }
}



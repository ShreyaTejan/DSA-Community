import java.util.*;
public class buyAndSellStock {
    
    public static int buySell(int prices[]) {
        int costPrice= Integer.MAX_VALUE;
        int maxProfit= 0;

        for(int i=0; i< prices.length; i++){

            if(costPrice <prices[i]){
                int profit = prices[i] -costPrice;
                maxProfit = Math.max(maxProfit, profit);
            }

            else{
                costPrice = prices[i];
            }
            

        }    

        return maxProfit;
    }
    
    public static void main(String[] args) {
        int prices[]= {21,20,77,30,6,3,9};
        System.out.println(buySell(prices));

    }
}

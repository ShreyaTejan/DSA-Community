import java.util.*;

public class maxSubArr1 {
    
    public static void subArr(int num[]){
        int currSum=0;
        int maxSum =Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            int start = i ;
            for(int j=i; j<num.length; j++){
                int end = j;
                currSum=0;
                for(int k=start; k<= end; k++){
                    currSum += num[k];

                }
                // System.out.println(currSum);
                if(maxSum< currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("MAX SUM SUB ARRAY IS = " + maxSum );

    }

    public static void main(String[] args) {
        int num[]={21, 66, 7,9,33,5,2};
        subArr(num);
    }
}

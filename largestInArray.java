import java.util.*;

public class largestInArray {
    public static int largestArr(int array[]){
        int maxNum = Integer.MIN_VALUE;

        for(int i = 0 ; i <array.length; i++){
            if(maxNum < array[i]){
                maxNum = array[i];
            }
        }  
        return maxNum;
    }

    public static void main(String[] args) {
        int array[]= {21,31,44,55};
        System.out.println("The largest element is =  " + largestArr(array));

    }
}

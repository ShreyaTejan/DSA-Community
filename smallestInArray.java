import java.util.* ;

public class smallestInArray {
    public static int smallestArr(int array[]){
        int minVal = Integer.MAX_VALUE;

        for(int i = 0 ; i < array.length; i++){
            if(minVal > array[i]){
                minVal = array[i];

            }
        }
        return minVal;
    }
    public static void main(String[] args) {
        int array[]= {21,31,10,44,55};
        System.out.println("The SMALLEST element is =  " + smallestArr(array));

    }
    
}

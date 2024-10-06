import java.util.*;
public class linearSearchArray {

    public static int linearSearch(int array[], int toFind){
        for(int i = 0 ; i < array.length; i++){
            if(array[i] ==toFind){
                return 1;
            }
        
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[]= {21,31,44,55};
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter element to find: ");
        int toFind= scn.nextInt();

        int indexCount= linearSearch(array, toFind);

        if(indexCount == -1){
            System.out.println("ELEMENT NOT IN ARRAY");
        }
        else{
            System.out.println("Element is in array  :) ");
        }

        scn.close();
        
    }
    
}

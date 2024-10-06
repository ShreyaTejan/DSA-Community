import java.util.*;

public class selectionSorting {
    


    public static void selectionSort( int arr[]){
        for (int i =0; i < arr.length-1 ; i++){
            int minPosition = i;
            for(int j= i+1; j< arr.length; j++){
                if(arr[minPosition] > arr[j]){ // dec order ke liye condition reverse
                    minPosition =j; //current position mana
                }
            }
            // ab swap by comparision
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i]= temp;

        }

    }

    public static void printArr(int arr[]){
        // n-2 turns

        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]= {21, 33, 88, 7, 3,4,0,9,44};
        selectionSort(arr);
        printArr(arr);
    }

}
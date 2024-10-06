import java.util.*;

public class insertionSorting {

    public static void insertSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) { 
            int currElt = arr[i];
            int prevElt = i - 1;
            //backtrack sorted part -- place to insert find
            while (prevElt >= 0 && arr[prevElt] > currElt) { 
                arr[prevElt + 1] = arr[prevElt];
                prevElt--; 
            }
            arr[prevElt + 1] = currElt; 
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {21, 33, 88, 7, 3, 4, 0, 9, 44};
        insertSort(arr);
        printArr(arr);
    }
}

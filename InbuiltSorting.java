import java.util.*;

public class InbuiltSorting {

    public static void inbuiltSort(int arr[]) {
        Arrays.sort(arr); 
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {21, 33, 88, 7, 3, 4, 0, 9, 44};
        inbuiltSort(arr);
        printArr(arr);
    }
}

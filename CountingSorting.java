import java.util.*;

public class CountingSorting {

    public static void countingSort(int arr[]) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];

    
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }


        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
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
        countingSort(arr);
        printArr(arr);
    }
}

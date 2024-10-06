import java.util.*;

public class secondLargestInAr {

    public static int secondLargestArr(int array[]) {
        // Initialize the largest and second largest elements
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate over the array to find the largest and second largest elements
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                // Update second largest before updating largest
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        // If second largest is still the initial value, it means there's no distinct second largest
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
            return -1;
        } else {
            return secondLargest;
        }
    }

    public static void main(String[] args) {
        int array[] = {21, 31, 44, 55}; // Example array
        int secondLargest = secondLargestArr(array);

        if (secondLargest != -1) {
            System.out.println("The second largest element is = " + secondLargest);
        }
    }
}

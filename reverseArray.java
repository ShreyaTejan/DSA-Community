import java.util.*;
public class reverseArray {
    public static void revArr(int array[]) {
        int first = 0;
        int end  = array.length -1;

        while (first <end) {
            int temp = array[end];
            array[end] = array[first];
            array[first] = temp;

            first++;
            end--;
            
        }
    }

    public static void main(String[] args) {
        int array[]= {21,31,37,88,74,44,55};
        revArr(array);

        for(int i =0 ; i < array.length; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
    

    
}

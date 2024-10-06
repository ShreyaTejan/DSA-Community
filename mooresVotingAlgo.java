import java.util.*;

public class mooresVotingAlgo {
    // majority element in an array find karata hai
    // counting majELt > n/2 
    // tc ON SC = O1

    public static int findCandidate(int[] a, int size) {
        int maj_index = 0, count = 1;
        for (int i = 1; i < size; i++) {
            if (a[maj_index] == a[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    
    public static boolean isMajority(int[] a, int size, int cand) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == cand) {
                count++;
            }
        }
        return count > size / 2;
    }


    public static void printMajority(int[] a, int size) {
      
        int cand = findCandidate(a, size);

       
        if (isMajority(a, size, cand)) {
            System.out.println("Majority Element: " + cand);
        } else {
            System.out.println("No Majority Element");
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 33, 33, 11, 2,33,33};
        int size = a.length;


        printMajority(a, size);
    }


    

}

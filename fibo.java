
import java.util.*;
public class fibo {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("How many terms do you want to print? ");
        int nTerms = scn.nextInt();
        int n1 = 0, n2 = 1, count = 0;

        
        if (nTerms <= 0) {
            System.out.println("Please enter a positive integer, the given number is not valid.");
        } 
      
        else if (nTerms == 1) {
            System.out.println("The Fibonacci sequence up to " + nTerms + " term: ");
            System.out.println(n1);
        } 
 
        else {
            System.out.println("The Fibonacci sequence is:");
            while (count < nTerms) {
                System.out.println(n1 + " ");
                
                
                int nth = n1 + n2;

                
                n1 = n2;
                n2 = nth;
                count++;
            }
            
        }
        scn.close();
    }
}



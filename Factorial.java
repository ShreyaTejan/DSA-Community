import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter integer to find factorial: ");
        int num = scn.nextInt();

        int factorial=1;
        
        for( int counter = 1; counter <= num; counter++){
            factorial = factorial*counter;
        }
        System.out.println("Factorial is: " + factorial);
        scn.close();
    }
    
}

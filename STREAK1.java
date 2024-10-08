import java.util.Scanner;

public class streak1 {

    public static int calcProd(int num1, int num2) {
        return num1*num2;
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = scn.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scn.nextInt();

        // method 1
        // int prod= num1*num2; 

        // method 2
        int prod = calcProd(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + prod);


        scn.close();


    }
    
}


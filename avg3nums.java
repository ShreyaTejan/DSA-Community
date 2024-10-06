import java.util.*;
public class avg3nums {

    public static int calcAvg3Nums(int num1, int num2, int num3) {
        return (num1+num2+num3)/3;
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = scn.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scn.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = scn.nextInt();

    
        int avg = calcAvg3Nums(num1, num2, num3);
        System.out.println("The average of " + num1 + ","+ num2 + " and " + num3 + " is: " + avg);


        scn.close();


    }
    
    
}

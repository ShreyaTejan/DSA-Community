import java.util.Scanner;

public class sumOfDigits {

    public static int sumDigi(int no) {
        int sumInit=0;
        while (no > 0 ) {
            int endDigit = (no % 10);
            sumInit = sumInit + endDigit;
            no = no /10; //updation

        }

        return sumInit;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter integer to compute sum of its digits: ");
        int num = scn.nextInt();

        System.out.println("Sum of all digits of" + num + " is: " + sumDigi(num));

        scn.close();
    }
}

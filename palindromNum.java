import java.util.Scanner;

public class palindromNum {
    
    public static boolean palindro(int n){
        int palindrome=n;
        int reverse=0;
        while(palindrome!=0) {
            int rem=palindrome%10;
            reverse=reverse*10+rem;
            palindrome=palindrome/10;
        }

        if (n == reverse) {
            return true;
            
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter integer to determine palindrome: ");
        int num = scn.nextInt();

        if(palindro(num)){
            System.out.println("Number is a palindrome");
        } 

        else{
            System.out.println("Number is NOT  a palidrome");
        }

        scn.close();
    }
}

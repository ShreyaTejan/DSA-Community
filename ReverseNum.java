import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        System.out.print("Enter integer to reverse: ");
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();

        while(num >0){
            int endDig= num % 10;
            System.out.println(endDig);
            num /= 10;
        }
        scn.close();
    }
    
}

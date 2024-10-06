import java.util.Scanner;

public class ReverseOriginal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number to reverse: ");
        int num = scn.nextInt();

        int rNum =0;

        while(num >0){
            int endDig =  num % 10;
            rNum = (rNum * 10) + endDig;
            num = num/10;

        }

        System.out.print(rNum);
        scn.close();
    }
}
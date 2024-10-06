import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter integer to calculate multiplication table: ");
        int num = scn.nextInt();

        for(int cntr= 1; cntr<=10; cntr++){
            int ans = num * cntr;
            System.out.println(num + "*" + cntr + "=" + ans);
        }
        scn.close();
    }
    
}

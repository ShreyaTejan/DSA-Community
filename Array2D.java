import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner scn = new Scanner(System.in);

        // Input elements into the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        // Printing output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " "); // Use print instead of println
            }
            System.out.println(); // This moves to the next line after printing each row
        }

        scn.close();
    }
}

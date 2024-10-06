public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= columns; j++) {
                // Print "*" at the borders, spaces inside
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
         
            System.out.println();
        }
    }
}

public class sortedSearchMatrix {
    public static boolean advSearch(int matrix[][], int key){
        int row =0, col =matrix[0].length-1;

        while ((row< matrix.length && col >=0)) {
            if (matrix[row][col] == key) {
                System.out.println("key is at ( "+ row+ " ,"+ col + ")");
                return true;
            }

            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("KEY DOES NOT EXIST");
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int key=8;
        advSearch(matrix, key);
     }
    
}

public class spiralMatrix {

    public static void printingSpiralMatrix(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //printing TOP ROW

            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            // RIGHT
            for(int i =startRow; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            //BOTTOM
            for(int j= endCol-1; j>=startCol; j--){
                System.out.print(matrix[endRow][j]+ " ");
            }

            //LEFT
            for(int i = endRow-1; i>=startRow; i--){
                System.out.print(matrix[i][startCol]+ " ");
            }
            startCol++;

            startRow++;
            
            endCol--;
            endRow--;
        }
        System.out.println();
    }
   public static void main(String[] args) {

    int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};

    printingSpiralMatrix(matrix);
    
    } 

}

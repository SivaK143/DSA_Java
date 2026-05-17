package TwoDArrays;

public class RotateBy90 {

    static void rotate(int matrix[][], int n){
        //step 1 Transpose in place
        for(int row=0; row<n; row++){
            for(int col=row+1;col<n; col++){
                int temp = matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
            }
        }
        //print matrix
        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //step 2 reverse rows
        //to reverse tarvel each row and swap the values using 2 pointer
        for(int row=0; row<n;row++){
            int startCol=0, endCol=n-1;
            while (startCol<=endCol){
                int temp=matrix[row][startCol];
                matrix[row][startCol]=matrix[row][endCol];
                matrix[row][endCol]=temp;
                startCol++;
                endCol--;
            }
        }
        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(matrix, matrix.length);
    }
}

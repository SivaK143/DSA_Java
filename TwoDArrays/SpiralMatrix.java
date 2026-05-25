package TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    static List<Integer> spiralOrder(int[][] matrix){

                List<Integer> list = new ArrayList<>();

                int startingRow = 0;
                int endingRow = matrix.length - 1;

                int startingCol = 0;
                int endingCol = matrix[0].length - 1;

                while (startingRow <= endingRow &&
                        startingCol <= endingCol) {

                    // left -> right
                    for (int i = startingCol; i <= endingCol; i++) {
                        list.add(matrix[startingRow][i]);
                    }
                    startingRow++;

                    // top -> bottom
                    for (int i = startingRow; i <= endingRow; i++) {
                        list.add(matrix[i][endingCol]);
                    }
                    endingCol--;

                    // right -> left
                    if (startingRow <= endingRow) {
                        for (int i = endingCol; i >= startingCol; i--) {
                            list.add(matrix[endingRow][i]);
                        }
                        endingRow--;
                    }

                    // bottom -> top
                    if (startingCol <= endingCol) {
                        for (int i = endingRow; i >= startingRow; i--) {
                            list.add(matrix[i][startingCol]);
                        }
                        startingCol++;
                    }
                }

                return list;
            }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }
}

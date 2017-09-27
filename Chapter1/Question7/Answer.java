package Chapter1.Question7;

import Chapter1.util.*;

public class Answer{
    public Answer() {

    }

    private static void resetMatrixToZero (int [][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main (String[] args) {
        int[][] matrix = Matrix.randomMatrix(3, 5, 0, 5);
        Matrix.printMatrix(matrix);
        resetMatrixToZero(matrix);
        System.out.println();
        System.out.println();
        Matrix.printMatrix(matrix);
    }


}
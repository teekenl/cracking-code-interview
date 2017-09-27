package Chapter1.Question6;

import Chapter1.util.*;

public class Answer {
    public Answer(){

    }

    private static void rotate(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; ++i) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = Matrix.randomMatrix(10, 10, 0, 9);
        Matrix.printMatrix(matrix);
        rotate(matrix, 10);
        System.out.println(); // print a new line for better viewing.
        Matrix.printMatrix(matrix);
    }

}
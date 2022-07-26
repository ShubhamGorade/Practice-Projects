
package assignment1;

/**
 *Java Program to Find Transpose of a Matrix
 * @author SHUBHAM
 */
public class Assignment46 {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {6, 3, 4}, {7, 1, 3} };

        // Display current matrix
        display(matrix);

        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display transposed matrix
        display(transpose);
    }

    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
    


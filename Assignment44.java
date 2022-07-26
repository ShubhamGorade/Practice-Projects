
package assignment1;

/**
 *Java Program to Add Two Matrix Using Multi-dimensional Arrays
 * @author SHUBHAM
 */
public class Assignment44 {
    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 5}, {5, 2, 3} };
        int[][] secondMatrix = { {7, 5, 3}, {4, 1, 3} };

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
    


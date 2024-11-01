
import java.util.Scanner;

//https://www.borntodev.com/devlab/task/225

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cols = sc.nextDouble();
        double rows = sc.nextDouble();
        double[][] matrix = new double[(int) rows][(int) cols];

        for (int row = 0; row < rows ; row++){
            for (int col = 0 ; col < cols ; col++){
                matrix[row][col] = sc.nextDouble();
            }
        }
        sc.close();

        double[][] normalized = normalizeMatrix(matrix);
        printMatrix(normalized);
    }

    public static double findMin(double[][] matrix) {
        double min = matrix[0][0];
        for (double[] row : matrix) {
            for (double value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    public static double findMax(double[][] matrix) {
        double max = matrix[0][0];
        for (double[] row : matrix) {
            for (double value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    public static double[][] normalizeMatrix(double[][] matrix) {
        double min = findMin(matrix);
        double max = findMax(matrix);
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] normalizedMatrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                normalizedMatrix[i][j] = (matrix[i][j] - min) / (max - min);
            }
        }
        return normalizedMatrix;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double ele : row) {
                System.out.printf("%.4f ", ele);
            }
            System.out.println();
        }
    }
}

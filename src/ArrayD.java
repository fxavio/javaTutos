import java.util.Arrays;

public class ArrayD {
    public static void main(String[] args) {
        // Create one-dimensional array
        int[] numbers = {1, 2, 3, 4, 5};
        // Print the array
        System.out.println(Arrays.toString(numbers));
        // Print each element of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
        }

       // Create a 2D array

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Print the matrix
        System.out.println(Arrays.deepToString(matrix));
        // Print each element of the matrix
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        // Create a 3D array
        int[][][] cube = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        // Print the cube
        System.out.println(Arrays.deepToString(cube));
        // Print each element of the cube
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                System.out.println(Arrays.toString(cube[i][j]));
            }
        }
    }
}

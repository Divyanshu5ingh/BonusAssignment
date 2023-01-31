import java.util.*;
public class spiralMatrixAssignment {

    //To solve this problem I have used 2D array

    /* The approach I am using is
            1. fill first row (top of the matrix)
            2. fill the last column (right of the matrix)
            3. fill the last row (bottom of the matrix)
            4. fill the first column (left of the matrix)
            */
    static int[][] matrix;

    // As mentioned in the assignment that I have to take two function as
    static void createSpiralMatrix(int n) {
        // here I am initializing the matrix as nXn matrix by using
        matrix = new int[n][n];
        // now  I am setting the counter as 1
        int count = 1;
        /*  Now I have to define the starting point and ending point of the row
            So I have taken it as */
        int top = 0;
        int bottom = n - 1;

        // same like that I have to set it for column
        int left = 0;
        int right = n - 1;

        // now to loop through it until all elements are filled in matrix I have use while loop
        while (count <= n * n) {

            // now to fill first row from left to right (top of the matrix) I have initialized this "for loop"
            for (int i = left; i <= right; i++) {
                matrix[top][i] = count;
                count++;
            }
            // to move to the next row I have to increment the top value
            top++;

            // now to fill last column from top to bottom I have initialized another for loop as
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count;
                count++;
            }
            // now I am moving to the previous column by decrementing the column value as
            right--;

            // to fill the last row from right to left I have initialized the for loop as
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = count;
                count++;
            }
            // now to go to the previous row
            bottom--;
            /* Now I have to fill the first column from bottom to top
                for that I have initialize "for loop" as */
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = count;
                count++;
            }
            // now to move to the next column
            left++;
        }
    }
    // As mentioned in the assignment I have used this 2nd function for printing the matrix
    static void printMatrix() {
        // Now to print the matrix row by row
        for (int i = 0; i < matrix.length; i++) {
            // and to print the element of each row
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            // to move to the next row after printing each row I have used a blank System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Asking the user to give the value of N of the nXn matrix
        System.out.println("Enter the input n (as nXn matrix) : ");
        int n = sc.nextInt();
        createSpiralMatrix(n);
        // Now calling the printMatrix method to print the matrix value
        printMatrix();
    }
}
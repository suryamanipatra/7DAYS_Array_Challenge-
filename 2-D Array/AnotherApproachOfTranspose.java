// Transpose of matrix without creating a new matrix, but this approach only applicable for square matrix.
import java.util.Scanner;

public class AnotherApproachOfTranspose {
    static void printMatrix(int[][] matrix){
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[i].length ; j++ ){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void inplaceTranspose(int[][] matrix, int r , int c){
        for (int i = 0 ; i < c ;i++){
            for (int j = i ; j < r ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " elements");
        for (int i = 0 ; i < r ; i++){
            for (int j = 0 ; j < c ;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix is");
        printMatrix(matrix);
        System.out.println("Transpose matrix is ");
        inplaceTranspose(matrix,r,c);
        printMatrix(matrix);

    }

}

import java.util.Scanner;

public class PreCalculateRectangularSum{
    static  void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
//        if (r >= 1) {
            int c = matrix[0].length;
//        }
        for (int i = 0 ; i < r ; i++){
            for (int j = 1 ; j < c ; j++){
                matrix[i][j]  += matrix[i][j-1];
            }
        }
    }
    static int findRectangularSum(int[][] matrix, int l1, int r1, int l2 , int r2){
        int totalSum = 0;
        findPrefixSumMatrix(matrix);
        for (int i = l1 ; i <= l2 ; i++){
            if (r1 >= 1)
            totalSum += matrix[i][r2] - matrix[i][r1-1];
            else
                totalSum += matrix[i][r2];
        }
        return totalSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r * c ;
        System.out.println("Enter " + totalElements + " elements");
        for (int i = 0 ; i < r ;i++){
            for (int j = 0 ; j < c ;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1,r1,l2,r2 ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Rectangle sum is " +   findRectangularSum(matrix,l1,r1,l2,r2) );


    }
}

import java.util.Scanner;

public class MultiDimensionalArray {
    // printing 2-D Array
    static void printArray(int[][] arr){
        for (int i = 0 ;i < arr.length ; i++){ // row
            for (int j = 0 ; j < arr[i].length ; j++){ // col
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         initialization of Array...
//        int[][] arr = new int[2][3];
//        Assign values to Array...
//        arr[0][0] = 1;
//        arr[0][1] = 4;
        // another method
        int[][] arr2 = {{1,5,6},{7,9,11},{8,1,1}};
        // print Array
//        printArray(arr2);
        // taking input from user for Array
        System.out.println("Enter number of rows ");
        int r = sc.nextInt();
        System.out.println("Enter number of column");
        int c = sc.nextInt();
        int [][] arr3 = new int[r][c];
        System.out.println("Enter " + r*c + "Elements");
        for (int i = 0; i < r; i++){
            for (int j = 0 ; j < c;j++){
                arr3[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Array is ");
        printArray(arr3);
    }
}

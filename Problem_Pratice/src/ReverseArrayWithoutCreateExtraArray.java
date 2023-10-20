import java.util.Scanner;

// Q. Another way to print reverse Array without creating additional Array.
public class ReverseArrayWithoutCreateExtraArray {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swappingArray(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reversingArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swappingArray(arr, i, j);
            i++;
            j--;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is ");
        printArray(arr);
        reversingArray(arr);
        System.out.println("Reverse Array is ");
        printArray(arr);
    }
}

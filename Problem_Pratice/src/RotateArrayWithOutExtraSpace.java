
// Q. Rotate the given Array 'a' by k steps , where k is non-negative without using extra space. [k can be greater than n as well]
import java.util.Scanner;

public class RotateArrayWithOutExtraSpace {
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

    static void reversingArray(int[] arr, int i, int j) {
        while (i < j) {
            swappingArray(arr, i, j);
            i++;
            j--;

        }
    }
    static void rotateInaPlaceArray(int[] arr, int k) {
        int n = arr.length;
        reversingArray(arr, 0, n - k - 1);
        reversingArray(arr, n - k, n - 1);
        reversingArray(arr, 0, n - 1);
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
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        System.out.println("Original Array is ");
        printArray(arr);
        rotateInaPlaceArray(arr,k);
        System.out.println("rotate Array is ");
        printArray(arr);
    }
}

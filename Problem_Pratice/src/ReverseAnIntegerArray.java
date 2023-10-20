import java.util.Scanner;

// Q.Reverse an Array consisting of Integer values.
public class ReverseAnIntegerArray {

    static void reverseArray(int[] arr) {
        System.out.println("Reverse Array is ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
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
        reverseArray(arr);
    }
}

import java.util.Scanner;

// Q. Another way to print reverse Array.
public class ReverseArrayAnotherMethod {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] secondReverseArray(int[] arr) {
        int n = arr.length;
        ;
        int[] ans = new int[n];
        int j = 0;
        //Traverse Original Array in reverse direction
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
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

        int[] ans = secondReverseArray(arr);
        System.out.println("Reverse Array is ");
        printArray(ans);
    }
}

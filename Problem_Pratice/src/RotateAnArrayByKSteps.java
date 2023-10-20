// Q. Rotate the given Array 'a' by k steps , where k is non-negative. [k can be greater than n as well]
 import java.util.Scanner;
public class RotateAnArrayByKSteps {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
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
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        System.out.println("Original Array is ");
        printArray(arr);
        int[] ans = rotateArray(arr,k);
        System.out.println("rotate Array is ");
        printArray(ans);
    }
}

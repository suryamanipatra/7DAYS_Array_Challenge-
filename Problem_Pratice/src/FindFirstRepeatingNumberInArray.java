// Q. Given an Array 'a' considering of integers. Return the first value that is repeating in this Array.If no value is being repeated , return -1.
import java.util.Scanner;

public class FindFirstRepeatingNumberInArray {

    static int firstRepeatingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];

                }
            }
        }
        return -1;
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
        System.out.println("First repeat value is " + firstRepeatingNumber(arr));
    }
}

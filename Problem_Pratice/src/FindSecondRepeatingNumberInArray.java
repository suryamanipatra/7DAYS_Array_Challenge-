import java.util.Scanner;

// Q. Given an Array 'a' considering of integers. Return the second value that is repeating in this Array.If no value is being repeated , return -1.
public class FindSecondRepeatingNumberInArray {
    static int secondRepeatingNumber(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];

                }
            }
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
        System.out.println("Second repeat value is " + secondRepeatingNumber(arr));
    }
}

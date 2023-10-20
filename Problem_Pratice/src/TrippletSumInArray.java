// Q. Count the number of triplets whose sum is equal to the given value x.


import java.util.Scanner;

public class TrippletSumInArray {
    static int tripletSum(int[] arr, int target) {
        int n = arr.length;
        int tripplet = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {
                        tripplet++;
                    }
                }
            }
        }
        return tripplet;
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

        System.out.println("Enter target sum");
        int target = sc.nextInt();

        System.out.println(tripletSum(arr, target));
    }
}

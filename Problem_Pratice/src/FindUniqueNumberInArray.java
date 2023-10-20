// Q. Find the unique number in a given Array where all  elements are being repeated twice with one value being unique(Only positive elements in Array).

import java.util.Scanner;

public class FindUniqueNumberInArray {

    static int findUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int value = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                value = arr[i];
            }
        }
        return value;
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

        System.out.println("Unique Element is " + findUnique(arr));
    }
}

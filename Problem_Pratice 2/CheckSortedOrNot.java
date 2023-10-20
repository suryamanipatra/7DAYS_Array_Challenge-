//  Q. Check the input Array is sorted or not.[Ascending Order]

import java.util.Scanner;

public class CheckSortedOrNot {
        static void isSorted() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Array:");
            int x = sc.nextInt();
            System.out.println("Enter the elements of Arrays");
            int[] arr = new int[x];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            boolean check = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] <= arr[i - 1]) {
                    check = false;
                    break;
                }
            }
            System.out.println("Given array is sorted " + check);

        }
        public static void main(String[] args) {

            CheckSortedOrNot obj = new CheckSortedOrNot();
            obj.isSorted();
        }
    }



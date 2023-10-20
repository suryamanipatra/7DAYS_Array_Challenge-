//Q.Print an Array whose first value is smallest element in Array and second element is largest element in array with out sort().

import java.util.Scanner;

    public class PrintSmallLargestElementInArray {
        static void sortAndPrintArray() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Array:");
            int x = sc.nextInt();
            System.out.println("Enter the elements of Arrays");
            int[] arr = new int[x];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = 0;
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.println(arr[0]);
            System.out.println(arr[arr.length - 1]);
        }

        public static void main(String[] args) {

            PrintSmallLargestElementInArray obj = new PrintSmallLargestElementInArray();
            obj.sortAndPrintArray();
        }
    }


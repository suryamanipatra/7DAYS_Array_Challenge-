// Q. Print an Array of kth smallest and kth largest elements.
import java.util.Scanner;
    public class printKthSmallestInArray {

        static void kthSmallestAndKthLargestElement() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Array:");
            int x = sc.nextInt();
            System.out.println("Enter the elements of Arrays");
            int[] arr = new int[x];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("sorted array is ");
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
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("Enter the kth element ");
            int k = sc.nextInt();
            System.out.println("kth smallest elements are :");
            for (int i = 0; i <= k - 1; i++) {
                System.out.println(arr[i]);
            }
        }
        public static void main(String[] args) {

            printKthSmallestInArray obj = new printKthSmallestInArray();
            obj.kthSmallestAndKthLargestElement();

        }
    }



// Q. Print the kth smallest and kth largest elements in the given Array.
import java.util.Arrays;
import java.util.Scanner;


    public class KthSmallAndLargeElement {
        static void printArray(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        static void anotherKthProblem() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Array:");
            int x = sc.nextInt();
            System.out.println("Enter the elements of Arrays");
            int[] arr = new int[x];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("sorted array is ");
            Arrays.sort(arr);
            printArray(arr);
            System.out.println("Enter the kth element ");
            int k = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (k == i) {
                    System.out.println("kth smallest element is " + arr[i-1]);
                }
            }
            for (int i = arr.length-1; i > 0; i--) {
                if (k == i) {
                    System.out.println("kth largest element is " + arr[arr.length-k]);
                }
            }

        }
        public static void main(String[] args) {

            KthSmallAndLargeElement obj = new KthSmallAndLargeElement();
            obj.anotherKthProblem();
        }
    }


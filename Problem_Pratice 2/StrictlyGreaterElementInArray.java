//Q. Find the number of elements which is strictly greater than the elements in an Array.
import java.util.Scanner;
    public class StrictlyGreaterElementInArray {
        static void strictlyGreater() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Array:");
            int x = sc.nextInt();
            System.out.println("Enter the elements of Arrays");
            int[] arr = new int[x];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the number you want to check in Array");
            int y = sc.nextInt();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > y) {
                    count++;
                }
            }
            System.out.println("Number of greater Elements are " + count);

        }

        public static void main(String[] args) {

            StrictlyGreaterElementInArray obj = new StrictlyGreaterElementInArray();
            obj.strictlyGreater();
        }
    }


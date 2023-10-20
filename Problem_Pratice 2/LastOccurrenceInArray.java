//Q.Find last occurrence of an element in Array.

import java.util.Scanner;
public class LastOccurrenceInArray {

        static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        static void lastOccurrence() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Array:");
            int x = sc.nextInt();
            System.out.println("Enter the elements of Arrays");
            int[] arr = new int[x];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the number you want to search in Array");
            int y = sc.nextInt();
            int lastIndex = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == y) {
                    lastIndex = i;
                }
            }
            System.out.println("Last occurrence is " + lastIndex);

        }

        public static void main(String[] args) {

            LastOccurrenceInArray obj = new LastOccurrenceInArray();
            obj.lastOccurrence();
        }
    }



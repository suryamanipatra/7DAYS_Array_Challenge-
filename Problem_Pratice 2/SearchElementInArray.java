//Q.Search an element in Array.

import java.util.Scanner;
 public class SearchElementInArray {
        static void printArray(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        static void searchArray() {
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
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == y) {
                    count++;
                }
            }
            System.out.println("count is " + count);


        }

        public static void main(String[] args) {
            SearchElementInArray obj = new SearchElementInArray();
            obj.searchArray();
        }
    }




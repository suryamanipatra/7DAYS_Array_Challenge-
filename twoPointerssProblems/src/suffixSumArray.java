import java.util.Scanner;

public class suffixSumArray {
    static void printArray(int[] arr){
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    static int[] makeSuffixSumArray(int[] arr){
        int n = arr.length;
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i <= 0 ; i++){
           suffixSum[n-2] = suffixSum[n - 1] + arr[n - 2];
        }
        return suffixSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array size ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
       System.out.println("Prefix sum Array is");
       int[] suffixSum =  makeSuffixSumArray(arr);
        printArray(suffixSum);
       }

    }

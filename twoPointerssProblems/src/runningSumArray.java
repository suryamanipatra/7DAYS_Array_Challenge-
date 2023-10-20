import java.util.Scanner;

public class runningSumArray {
    static void printArray(int[] arr){
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n ; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    // Another method without creating new Array
    static int[] anotherApproachOfRunningSum(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n ; i++){
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
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
        System.out.println("Original Array is ");
        printArray(arr);
//        System.out.println("Prefix sum Array is ");
//        int[] pref = makePrefixSumArray(arr);
//        printArray(pref);

        System.out.println("Prefix sum Array is");
//        anotherApproachOfRunningSum(arr);
        printArray(arr);

    }
}

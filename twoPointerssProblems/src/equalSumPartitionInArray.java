import java.util.Scanner;

public class equalSumPartitionInArray {
    static int totalArraySum(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
 static boolean equalSumPartition(int[] arr){
         int totalSum = totalArraySum(arr);
         int prefSum = 0;
         for (int i = 0 ; i < arr.length ; i++){
             prefSum += arr[i];
             int suffixSum = totalSum - prefSum;
             if(suffixSum == prefSum){
                 return true;
             }
         }
         return false;
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal Partition Possible is " + equalSumPartition(arr));
    }
}

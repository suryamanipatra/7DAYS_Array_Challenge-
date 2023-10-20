import java.util.Scanner;

public class sortArrayBySquares {
    static void printArray(int[] arr){
        for (int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swapArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArray(int[] arr){
        int i = 0,j = arr.length - 1;
        while (i < j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while (left <= right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array size ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is ");
        printArray(arr);
        int[] ans = sortSquares(arr);
        System.out.println("Sorted Array is ");
        reverseArray(ans);
        printArray(ans);
    }
}

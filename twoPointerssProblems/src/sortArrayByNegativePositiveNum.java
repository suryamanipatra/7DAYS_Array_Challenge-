import java.util.Scanner;

public class sortArrayByNegativePositiveNum {
    static void printArray(int[] arr){
        for (int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swapArray(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortArrayByNum(int[] arr){
        int n = arr.length;
        int left = 0,right = n-1;
        while(left < right){
            if (arr[left] > 0 && arr[right] < 0){
                swapArray(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] < 0){
                left++;
            }
            if(arr[right] > 0){
                right--;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array size ");
        int n = sc.nextInt();
        System.out.println("Enter " + n+ " elements");
        int[] arr = new int[n];
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is ");
        printArray(arr);
        sortArrayByNum(arr);
        System.out.println("Sorted Array is ");
        printArray(arr);

    }
}

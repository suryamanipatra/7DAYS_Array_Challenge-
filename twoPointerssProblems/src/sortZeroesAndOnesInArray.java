import java.util.Scanner;

public class sortZeroesAndOnesInArray {
    static void printArray(int[] arr){
        for (int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swapArray(int[] arr , int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZerosAndOnes(int[] arr){
        int n = arr.length;
        //count number of Zeroes and stores the count
        int countZeroes = 0;
        for (int i = 0; i < n; i++){
            if(arr[i] == 0){
                countZeroes++;
            }
        }
        for (int i = 0; i < n; i++){
            if (i < countZeroes){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
    }
    // Another way to sort the 0s & 1s in Array
    static void anotherMethodToSort(int[] arr){
        int n = arr.length;
        int left = 0 , right = n - 1;
        while(left < right){
            if (arr[left] == 1 &&  arr[right] == 0){
                swapArray(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + "elements");
        for (int i = 0;i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is ");
        printArray(arr);
//        sortZerosAndOnes(arr);
        anotherMethodToSort(arr);
        System.out.println("Sorted Array is ");
        printArray(arr);
    }
}

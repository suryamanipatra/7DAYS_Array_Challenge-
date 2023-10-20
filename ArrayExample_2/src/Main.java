import java.util.Arrays;
import java.util.Scanner;
class ArrayExample_2{
    static void changeValue(int a){
        a = 2000;
    }
//   PRINTING AN ARRAY
    static void printArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

// HOW TO CRATE A ZERO ARRAY[by default if you don't assign any value to an Array, in JAVA it will assign zero to all values of an Array   ]

    static void zeroArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            arr[i] = 0;
        }
    }

    // 1. Taking input elements of an Array in Java.

    void inputInArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();
        int[] arry = new int[n];
        System.out.println("Enter the element of array");
        for(int i =0;i<arry.length;i++){
            arry[i] = sc.nextInt();
        }
       printArray(arry);
    }

    // 2.copying Array(SHALLOW COPY)in java.

    void copyArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();
        int[] arry = new int[n];
        System.out.println("Enter the element of array");
        for(int i =0;i<arry.length;i++){
            arry[i] = sc.nextInt();
        }
        System.out.println("original array");
     printArray(arry);
        // trying to coppy arry to arr2
        int[]  arry2 = arry;
        System.out.println("Coppied arry2");
        printArray(arry2);
        // Changing some values of arry2
        arry2[0] = 0;
        arry2[1] = 0;
        System.out.println("original array after changing arry2");
        printArray(arry);
        System.out.println("coppied array after changing arry2");
        printArray(arry2);

    }

    // 3.Array reference in java.

    void refArray(){
        int a = 5;
        changeValue(a);
        System.out.println(a); // 5
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 21;
        arr[3] = 13;
        arr[4] = 31;
        zeroArray(arr); // 1,4,21,13,31 but o/p is 0,0,0,0,0
        printArray(arr);
    }

    //4. DEEP COPY of Array in Java.

    void deepCopyArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();
        int[] arry = new int[n];
        System.out.println("Enter the element of array");
        for(int i =0;i<arry.length;i++){
            arry[i] = sc.nextInt();
        }
        System.out.println("original array");
        printArray(arry);

        // trying to copy array to arr2

        int[]  array2 = arry.clone();
        System.out.println("Copied array2");
        printArray(array2);

        // Changing some values of array2

        array2[0] = 0;
        array2[1] = 0;
        System.out.println("original array after changing array2");
        printArray(arry);
        System.out.println("copied array after changing array2");
        printArray(array2);

    }
    void secondCopyArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();
        int[] arry = new int[n];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }
        System.out.println("original array");
        printArray(arry);

        // trying to copy array to array2

        int[] array2 = Arrays.copyOf(arry,arry.length);
        System.out.println("Copied array2");
        printArray(array2);

        int[] arry3 = Arrays.copyOfRange(arry,0,arry.length);
        System.out.println("Copied array3");
        printArray(arry3);

        int[] arry4 = Arrays.copyOfRange(arry,1,3);
        System.out.println("Copied array2");
        printArray(arry4);
    }


}



public class Main {
    public static void main(String[] args) {
        ArrayExample_2 obj =  new ArrayExample_2();
//        obj.inputInArray();
//        obj.copyArray();
//        obj.refArray();
//        obj.deepCopyArray();
        obj.secondCopyArray();
    }
}
import java.util.Scanner;

// Q. Given 2 integers a and b.Swap the 2 given values using temporary variables.
public class SwapElementUsingThirdVariable {

    static void swapTwoNumbers(int a, int b) {
        System.out.println("Original values before Swapping ");
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after Swapping ");
        System.out.println("a is " + a);
        System.out.println("b is " + b);

    }

    public static void main(String[] args) {
        swapTwoNumbers(9,3);
    }
}

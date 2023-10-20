import java.util.Scanner;
// Q.Given 2 integers a and b.Swap the 2 given values using XOR  method.

public class SwapElementUsingXOR {
    static void swapping(int a, int b) {
        System.out.println("Original values before Swapping ");
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Values after Swapping ");
        System.out.println("a is " + a);
        System.out.println("b is " + b);

    }

    public static void main(String[] args) {
        swapping(9,3);
    }
}

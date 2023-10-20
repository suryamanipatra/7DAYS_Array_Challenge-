import java.util.Scanner;

// Given Q queries, check if the given number is present in the array or not.[Note : value of all the elements in the Array is less than 10 to the Power 5]
 public class QueryCheckInArray {
    static int[] frequencyArray(int[] arr){
        int[] freq = new int[100001];
        for(int i =0;i < arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] freq = frequencyArray(arr);
        System.out.println("Enter number of Queries: ");
        int k = sc.nextInt();
        while (k>0){
            System.out.println("Enter your Queries :");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            k--;
        }


    }
}

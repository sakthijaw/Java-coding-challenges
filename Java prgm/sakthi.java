import java.util.Scanner;

public class sakthi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt(); 

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("Value at index " + i + " is " + arr[i]);
        }

        sc.close(); 
    }
}




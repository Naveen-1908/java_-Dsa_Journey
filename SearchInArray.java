import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}


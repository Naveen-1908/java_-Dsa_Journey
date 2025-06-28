import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for 'n'
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Call the method to print pattern
        pattern3(n);
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}


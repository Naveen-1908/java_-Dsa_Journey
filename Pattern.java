import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for 'n'
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Call the method to print the pattern
        pattern4(n);
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}


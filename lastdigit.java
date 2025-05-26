import java.util.Scanner;

public class lastdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int lastDigit = Math.abs(num % 10);  // Math.abs to handle negative numbers
        System.out.println("Last digit: " + lastDigit);
    }
}


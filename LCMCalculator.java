import java.util.Scanner;

public class LCMCalculator {
    static int findLCM(int a, int b) {
        int res = Math.max(a, b);

        while (true) {
            if (res % a == 0 && res % b == 0) {
                return res;
            }
            res++;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        System.out.print("Enter second number: ");
        int b = scan.nextInt();
        scan.close();

        System.out.println("LCM of " + a + " and " + b + " is: " + findLCM(a, b));
    }
}

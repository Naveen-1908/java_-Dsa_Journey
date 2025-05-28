public class PatternPrinter1 {
    static int n = 5;

    public static void patternA() {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternA();
    }
}






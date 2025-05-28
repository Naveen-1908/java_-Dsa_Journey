public class DigitCounter {
    public static void main(String[] args) {
        int number = -12345;
        int count = String.valueOf(Math.abs(number)).length();

        System.out.println("Number of digits: " + count);
    }
}



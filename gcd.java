
import java.util.Scanner;

public class gcd{
    public static void main(String[] args) {
        int number1, number2;
        System.out.println("enter first number:");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        System.out.println("enter secpnd number:");
        number2 = sc.nextInt();


        while (number1 != number2){
            if(number1 > number2)
            number1 = number1 - number2;
            if(number2 > number1)
            number2 = number2 - number1;
        }
        System.out.println("gcd = " + number1);
    }
}
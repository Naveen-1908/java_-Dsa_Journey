import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        int base, exponent;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base number:");
        base = sc.nextInt();
        System.out.println("enter exponent number:");
         exponent= sc.nextInt();

         int result = 1;
         for(int i=1;i<=exponent;i++){
            result = result*base;
         }
          System.out.println(base + " raised to the power " + exponent + " is: " + result);
        sc.close();
        
    }
    
}

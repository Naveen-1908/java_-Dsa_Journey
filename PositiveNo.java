import java.util.Scanner;

public class PositiveNo{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("The given number is zero0");
        }
        String result=num>0?"The given number is positive":"The given number is negative";
        System.out.println(result);
        sc.close();
        
    }
}
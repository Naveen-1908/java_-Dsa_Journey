import java.util. Scanner; 
public class factorial {

    static int fact(int n){
        int res = 1;
         for(int i=1;i<=n;i++){
            res = res*i;
         }
         return res;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      System.err.println ( fact(n));
      sc.close();
    }
}

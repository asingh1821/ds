import java.math.BigInteger;

public class DemoMain {
    public static void main(String[] args) {
        int a = 5,fact = 1;
        for(int i=1; i<=a; i++){
           fact *= i;
        }
      System.out.println(fact);
    }
}

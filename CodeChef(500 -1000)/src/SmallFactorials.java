import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorials {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            BigInteger fact = BigInteger.ONE;
            int n = sc.nextInt();
            for (int j = 2; j <= n; j++) {
                fact = fact.multiply(BigInteger.valueOf(j));
            }
            System.out.println(fact);
        }
    }
}

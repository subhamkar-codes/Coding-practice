import java.util.Scanner;

public class FirstandLastDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int l = n % 10;

            int f = n;
            while (f >= 10) {
                f = f / 10;
            }

            int s = f + l;

            System.out.println(s);
        }
    }
}

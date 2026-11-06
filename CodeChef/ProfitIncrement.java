import java.util.Scanner;

public class ProfitIncrement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
//            int ae = ((b * b) / 100);
            int after = b + (a /10);

            System.out.println(after);
        }
    }
}

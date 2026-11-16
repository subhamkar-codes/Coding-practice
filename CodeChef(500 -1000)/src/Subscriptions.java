import java.util.Scanner;

public class Subscriptions {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int subscription = (n + 5)/6;
            System.out.println(x*subscription);

        }
    }
}

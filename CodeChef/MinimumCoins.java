import java.util.Scanner;

public class MinimumCoins {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            a = a%10;
            System.out.println(a);
        }
    }
}

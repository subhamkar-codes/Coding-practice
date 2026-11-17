import java.util.Scanner;

public class CREDCoins {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println((x*y)/100);
        }
    }
}

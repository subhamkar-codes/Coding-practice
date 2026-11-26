import java.util.Scanner;

public class MinimumNumberOfCoins {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int Frs = x / 5;
            int Trs = x /10;
            if (x % 5 == 0){
            System.out.println(Math.max(Frs , Trs) - Math.min(Frs , Trs));
            }
            else {
                System.out.println(0);
            }

        }
    }
}

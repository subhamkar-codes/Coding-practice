import java.util.Scanner;

public class BestCoupon {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int ds = (int) (x * 0.10);
            if (ds <= 100){
                System.out.println(100);
            }
            else {
                System.out.println(ds);
            }
        }
    }
}

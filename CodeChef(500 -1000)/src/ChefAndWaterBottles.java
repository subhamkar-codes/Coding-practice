import java.util.Scanner;

public class ChefAndWaterBottles {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            if (k/x <= n){
                System.out.println(k/x);
            }

           else if (k/x > n){
                System.out.println(n);
           }
        }
    }
}

import java.util.Scanner;

public class TestScore {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y % x == 0 && y <= x*n){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

        }
    }
}

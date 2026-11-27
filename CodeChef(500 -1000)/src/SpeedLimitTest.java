import java.util.Scanner;

public class SpeedLimitTest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int x = sc.nextInt();
            int b = sc.nextInt();
            int y = sc.nextInt();
            if (a*y < b*x){
                System.out.println("BOB");
            } else if (a*y > b*x) {
                System.out.println("Alice");
            }
            else {
                System.out.println("Equal");
            }
        }
    }
}

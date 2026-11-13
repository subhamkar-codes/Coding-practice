import java.util.Scanner;

public class BatteryLow {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            if (x <= 15){
                System.out.println("YES");
            } else if (x > 15 && x<= 100) {
                System.out.println("NO");
            }
        }
    }
}

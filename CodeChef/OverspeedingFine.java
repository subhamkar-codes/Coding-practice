import java.util.Scanner;

public class OverspeedingFine {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int s = sc.nextInt();
            if (s <= 70) {
                System.out.println(0);
            } else if (s > 70 && s <= 100) {
                System.out.println(500);
            }
            else {
                System.out.println(2000);
            }
        }
    }
}

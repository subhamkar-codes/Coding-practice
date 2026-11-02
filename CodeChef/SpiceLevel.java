import java.util.Scanner;

public class SpiceLevel {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            if (a < 4) {
                System.out.println("MILD");
            } else if (a >=4 && a < 7) {
                System.out.println("MEDIUM");
            }
            else {
                System.out.println("HOT");
            }
        }
    }
}

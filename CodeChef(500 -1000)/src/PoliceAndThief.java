import java.util.Scanner;

public class PoliceAndThief {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(Math.max(x , y) - Math.min(x , y));
        }
    }
}

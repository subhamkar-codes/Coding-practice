import java.util.Scanner;

public class MarioAndBullet {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int tvTime = y/x;
            System.out.println(Math.max(0,z-tvTime));
        }
    }
}

import java.util.Scanner;

public class ChessboardDistance {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            System.out.println(Math.max(Math.abs(x1-x2),Math.abs(y1-y2)));
        }
    }
}

import java.util.Scanner;

public class ChessTime {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int c = sc.nextInt();
            System.out.println(c * 3);
        }
    }
}

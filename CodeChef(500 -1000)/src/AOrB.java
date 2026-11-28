import java.util.Scanner;

public class AOrB {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int attempt1 = (500 - (x*2)) + (1000- ((x+y)*4));
            int attempt2 = (1000- (y*4))+(500- ((x+y)*2));

            System.out.println(Math.max(attempt1,attempt2));

        }
    }
}

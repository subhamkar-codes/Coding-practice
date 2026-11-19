import java.util.Scanner;

public class IsTheScoreConsistent {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (c>= a && d >= b){
                System.out.println("POSSIBLE");
            }
            else {
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}

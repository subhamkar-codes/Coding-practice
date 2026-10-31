import java.util.Scanner;

public class ChefandWireFrames {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            a = 2*a;
            b = 2*b;
            int d = a + b;
            System.out.println(c * d);
        }
    }
}

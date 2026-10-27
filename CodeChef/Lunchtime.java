import java.util.Scanner;

public class Lunchtime {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            if (a >= 1 && a <= 4){
                System.out.println("Yes");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}

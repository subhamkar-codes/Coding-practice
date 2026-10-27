import java.util.Scanner;

public class Sleepdeprivation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            if (a >= 7){
                System.out.println("NO");
            }
            else {
                System.out.println("Yes");
            }

        }
    }
}

import java.util.Scanner;

public class Fever {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int f = sc.nextInt();
            if (f <= 98){
                System.out.println("NO");
            }
            else {
                System.out.println("Yes");
            }
        }
    }
}

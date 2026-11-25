import java.util.Scanner;

public class WaterMixing {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (b >= a){
                System.out.println((b-a<=x)? "yes" : "No");
            }
            else {
                System.out.println((a-b<=y)? "yes" : "No");
            }
        }
    }
}

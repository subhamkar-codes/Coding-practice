import java.util.Scanner;

public class JengaNight {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n <= x){
                if (x % n == 0) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

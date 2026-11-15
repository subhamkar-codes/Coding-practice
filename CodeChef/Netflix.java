import java.util.Scanner;

public class Netflix {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            if (a + b >= x || a + c >= x || c + b >= x){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}

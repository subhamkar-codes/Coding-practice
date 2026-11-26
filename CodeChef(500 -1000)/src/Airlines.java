import java.util.Scanner;

public class Airlines {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            int req = (n+99) / 100;
            if (req > x){
                System.out.println(req - x);
            }
            else {
                System.out.println(0);
            }
        }
    }
}

import java.util.Scanner;

public class FlipTheCards {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n == x ){
                System.out.println(0);
            }
            else{
                System.out.println(Math.min(x , n-x));
            }
        }
    }
}

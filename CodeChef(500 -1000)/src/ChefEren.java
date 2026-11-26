import java.util.Scanner;

public class ChefEren {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int odd = (n+1)/2;
            int even = n/2;
            System.out.println((even*a)+(odd*b));
        }
    }
}

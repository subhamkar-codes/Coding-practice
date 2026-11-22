import java.util.Scanner;

public class FindingShoes {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int xtrL = Math.max(0,n-m);
            System.out.println(n+xtrL);
        }
    }
}

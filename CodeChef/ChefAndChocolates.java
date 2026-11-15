import java.util.Scanner;

public class ChefAndChocolates {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int fl = (c - x)*y;
            System.out.println(fl);
        }
    }
}

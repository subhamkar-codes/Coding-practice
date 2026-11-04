import java.util.Scanner;

public class Discount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int discount = sc.nextInt();
            System.out.println(100 - discount);
        }
    }
}

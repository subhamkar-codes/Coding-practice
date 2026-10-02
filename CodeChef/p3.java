import java.util.Scanner;

public class p3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        int od = 7 - sum;
        System.out.println(od);
    }
}

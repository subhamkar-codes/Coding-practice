import java.util.Scanner;

public class ATM {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        double Y = sc.nextDouble();

        if (X % 5 == 0 && Y >= X + 0.50) {
            Y -= (X + 0.50);
        }


        System.out.printf("%.2f\n", Y);
    }
}
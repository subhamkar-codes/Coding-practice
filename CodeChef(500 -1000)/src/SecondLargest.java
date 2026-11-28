import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int secondLargest;
            if ((a >= b && a <= c) || (a >= c && a <= b)) {
                secondLargest = a;
            } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
                secondLargest = b;
            } else {
                secondLargest = c;
            }

            System.out.println(secondLargest);
        }
        sc.close();
    }
}
import java.util.Scanner;

public class FillCandies {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            System.out.println((n+(k*m)-1)/(k*m));



        }
    }
}

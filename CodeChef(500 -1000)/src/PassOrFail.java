import java.util.Scanner;

public class PassOrFail {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();
            int wrong = n - x;
            if ( ((x*3) - (wrong)) >= p){
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }
        }
    }
}

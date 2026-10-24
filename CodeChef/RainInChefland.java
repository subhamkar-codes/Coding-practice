import java.util.Scanner;

public class RainInChefland {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i ++){
            int a = sc.nextInt();
            if (a < 3) {
                System.out.println("LIGHT");
            } else if (a >= 3 && a < 7) {
                System.out.println("MODERATE");
            }
            else{
                System.out.println("HEAVY");
            }
        }
    }
}

import java.util.Scanner;

public class TheLastLevels {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x <= 3){
                System.out.println(x*y);
            }
            else {
                if (x%3 ==0) {
                    int half = x / 3;
                    System.out.println((x * y) + ((half-1) * z));
                }
                else {
                    int half = x / 3;
                    System.out.println((x * y) + ((half) * z));
                }
            }
        }
    }
}

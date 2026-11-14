import java.util.Scanner;

public class MonopolyInChefland {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x == y && y == z){
                System.out.println("NO");
            }else {
                if ((x + y) < z ||(y + z) < x ||(x + z) < y ) {
                    System.out.println("YES");

                } else {
                    System.out.println("NO");

                }
            }
        }
    }
}

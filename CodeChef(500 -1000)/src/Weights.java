import java.util.Scanner;

public class Weights {
    static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int w = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                if (w == x || w == y || w == z){
                    System.out.println("Yes");
                } else if (w == x+y || w == y+z || w == z + x) {
                    System.out.println("Yes");
                } else if (w == x + y + z) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
    }
}

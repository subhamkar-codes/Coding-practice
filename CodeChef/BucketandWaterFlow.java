import java.util.Scanner;

public class BucketandWaterFlow {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x == (w + (y*z))){
                System.out.println("Filled");
            }
            else if (x < (w + (y*z))){
                System.out.println("Overflow");
            }
            else {
                System.out.println("Unfilled");
            }
        }
    }
}

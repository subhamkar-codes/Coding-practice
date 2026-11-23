import java.util.Scanner;

public class MarioAndTransformation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            if (x%3==0){
                System.out.println("Normal");
            } else if (x%3 == 1) {
                System.out.println("Huge");
            }else {
                System.out.println("Small");
            }
        }
    }
}

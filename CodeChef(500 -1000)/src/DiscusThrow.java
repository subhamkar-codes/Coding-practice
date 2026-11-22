import java.util.Scanner;

public class DiscusThrow {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == b && b == c){
                System.out.println(a);
            }
            else if (a == b && a < c){
                System.out.println(c);
            }
            else if (b == c && c < a){
                System.out.println(a);
            }
            else if (a == c && b > a){
                System.out.println(b);
            }
            else if (a == c && b < a){
                System.out.println(a);
            }
            else if (b == c && c > a){
                System.out.println(c);
            }
            else if (a == b && a > c){
                System.out.println(a);
            }
            else {

                if (a > b) {
                    if (a > c) {
                        System.out.println(a);
                    } else {
                        System.out.println(c);
                    }
                } else if (b > a) {
                    if (b > c) {
                        System.out.println(b);
                    } else {
                        System.out.println(c);
                    }
                }
            }
        }

    }
}

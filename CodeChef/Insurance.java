import java.util.Scanner;

public class Insurance {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a>b){
                System.out.println(b);
            }
            else System.out.println(a);
        }
    }
}

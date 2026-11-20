import java.util.Scanner;

public class SastaSharkTank {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a*10 < b*5){
                System.out.println("Second");
            } else if (a*10>b*5) {
                System.out.println("First");
            }else{
                System.out.println("Any");
            }
        }
    }
}

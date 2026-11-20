import java.util.Scanner;

public class QualifyTheRound {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a + b*2) >= x){
                System.out.println("Qualify");
            }
            else{
                System.out.println("NotQualify");
            }
        }
    }
}

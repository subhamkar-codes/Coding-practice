import java.util.Scanner;

public class GoodInvestmentorNot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b*2 > a){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }

        }
    }
}

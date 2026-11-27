import java.util.Scanner;

public class SelfDefenceTraining {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int count = 0;
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a>= 10 && a<= 60){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

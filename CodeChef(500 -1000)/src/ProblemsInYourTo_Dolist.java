import java.util.Scanner;

public class ProblemsInYourTo_Dolist {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {

                int d = sc.nextInt();
                if (d >= 1000){
                    count++;
                }
            }
            System.out.println(count);
             count = 0;
        }
    }
}

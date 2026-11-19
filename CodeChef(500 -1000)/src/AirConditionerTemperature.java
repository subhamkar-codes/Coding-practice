import java.util.Scanner;

public class AirConditionerTemperature {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int minrq = Math.max(a , c);
            if (minrq <= b ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}

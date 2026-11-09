import java.util.Scanner;

public class SumofDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b;
            int sum = 0;
           while (a>0){
                sum += a%10;
                a =  a/10;

            }
            System.out.println(sum);
        }
    }
}

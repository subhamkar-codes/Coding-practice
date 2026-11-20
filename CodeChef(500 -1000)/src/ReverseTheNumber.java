import java.util.Scanner;

public class ReverseTheNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int temp;
            int rev = 0;
            while (x != 0){
                temp = x % 10;
                rev = rev*10 + temp;
                x = x/10;
            }
            System.out.println(rev);
        }
    }
}

import java.util.Scanner;

public class p6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multi;
        for(int i = 1 ; i <= 10; i++){
            multi = n*i;
            System.out.println(n + " x " + i + " = " + multi);
        }

    }
}

import java.util.Scanner;

public class ChefAndNextGen {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((x*y)>=(a*b)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

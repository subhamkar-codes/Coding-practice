import java.util.Scanner;

public class p5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0;  i<= t ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int diff = x - y;
            System.out.println(diff);
        }
    }
}

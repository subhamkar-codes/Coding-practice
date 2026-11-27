import java.util.Scanner;

public class CupFinals {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int d = sc.nextInt();
            if (Math.max(x,y)-Math.min(x , y)<= d){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}

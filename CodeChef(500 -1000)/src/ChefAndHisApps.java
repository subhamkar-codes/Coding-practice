import java.util.Scanner;

public class ChefAndHisApps {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int s = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int unused = s - (x+y);

            if (unused >= z){
                System.out.println(0);
            } else if (unused + Math.max(x ,y)>=z) {
                System.out.println(1);
            }else {
                System.out.println(2);
            }
        }
    }
}

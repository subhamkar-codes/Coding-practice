import java.util.Scanner;

public class IsItHotorCold {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            if (a >20){
                System.out.println("HOT");
            }
            else {
                System.out.println("COLD");
            }
        }
    }
}

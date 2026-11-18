import java.util.Scanner;

public class ExpertSetter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((y) >= x*0.5){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}

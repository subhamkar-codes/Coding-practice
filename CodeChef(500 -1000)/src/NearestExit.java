import java.util.Scanner;

public class NearestExit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            if (x > 50){
                System.out.println("Right");
            }else{
                System.out.println("Left");
            }
        }
    }
}

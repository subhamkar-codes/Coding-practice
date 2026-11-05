import java.util.Scanner;

public class Instagram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a> b*10){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}

import java.util.Scanner;

public class TheCheaperCab {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b){
                System.out.println("FIRST");
            } else if (b < a) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }
    }
}

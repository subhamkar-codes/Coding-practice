import java.util.Scanner;

public class ChessRatings {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == y){
                System.out.println(0);
            }else {
            System.out.println((y-x+7)/8);}
        }
    }
}

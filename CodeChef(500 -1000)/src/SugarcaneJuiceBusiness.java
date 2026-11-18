import java.util.Scanner;

public class SugarcaneJuiceBusiness {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println((50*n)-(n*10+n*10+n*15));
        }
    }
}

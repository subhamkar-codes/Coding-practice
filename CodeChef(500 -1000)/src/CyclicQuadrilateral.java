import java.util.Scanner;

public class CyclicQuadrilateral {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if ((a+c)==180|| (b+d)== 180){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


        }
    }
}

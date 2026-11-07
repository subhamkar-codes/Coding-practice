import java.util.Scanner;

public class ChefandMasks {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a*100 == b*10){
                System.out.println("Cloth");
            } else if (a*100 < b*10) {
                System.out.println("Disposable");
            } else if (a*100 > b*10) {
                System.out.println("Cloth");
            }
        }
    }
}

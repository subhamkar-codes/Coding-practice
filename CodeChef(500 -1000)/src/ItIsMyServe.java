import java.util.Scanner;

public class ItIsMyServe {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if ((((p+q)/2)%2 == 0)){
                System.out.println("Alice");
            }
            else{
                System.out.println("Bob");
            }
        }
    }
}

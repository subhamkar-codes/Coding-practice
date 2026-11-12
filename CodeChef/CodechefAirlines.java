import java.util.Scanner;

public class CodechefAirlines {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (10*a >= b){
                System.out.println(b*c);
            }
            else{
                System.out.println((10*a)*c);
            }
        }
    }
}

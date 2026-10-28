import java.util.Scanner;

public class CarTrip {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
        int c = sc.nextInt();
          if ((c*10)< 3000){
            System.out.println(3000);
          }
           else {
            System.out.println(c*10);
          }
        }
    }
}

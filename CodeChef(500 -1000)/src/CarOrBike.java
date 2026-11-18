import java.util.Scanner;

public class CarOrBike {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == y){
                System.out.println("SAME");
            }
            else if(x < y){
                System.out.println("BIKE");
            }
            else{
                System.out.println("CAR");
            }
        }
    }
}

import java.util.Scanner;

public class TooManyFloors {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(Math.abs(((x-1)/10+1)-((y-1)/10+1)));
        }
    }
}

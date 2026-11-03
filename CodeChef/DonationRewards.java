import java.util.Scanner;

public class DonationRewards {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            if (a <= 3){
                System.out.println("BRONZE");
            } else if (a > 3 && a <= 6) {
                System.out.println("SILVER");
            }
            else{
                System.out.println("GOLD");
            }
        }
    }
}

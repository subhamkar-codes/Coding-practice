import java.util.Scanner;

public class ElectionsInChefland {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int count = 0;
            for (int j = 0; j < n; j++) {
                int d = sc.nextInt();
                if (d >= x){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

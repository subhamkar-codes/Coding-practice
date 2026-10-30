import java.util.Scanner;

public class SixFriends {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a*3 < b*2){
                System.out.println(a*3);
            }
            else{
                System.out.println(b*2);
            }

        }
    }
}

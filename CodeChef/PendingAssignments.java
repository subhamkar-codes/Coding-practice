import java.util.Scanner;

public class PendingAssignments {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((a*b)<= (c*24*60)){
                System.out.println("yes");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

import java.util.Scanner;

public class JanmanshAndAssignments {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            if (x+3<=10){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

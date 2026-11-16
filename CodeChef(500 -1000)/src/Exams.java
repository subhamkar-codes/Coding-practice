import java.util.Scanner;

public class Exams {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            double percentage = ((double)z/(x*y))*100;
            if (percentage > 50){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

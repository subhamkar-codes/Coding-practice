import java.util.Scanner;

public class CourseRegistration {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((b-c)>=a){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}

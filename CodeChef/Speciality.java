import java.util.Scanner;

public class Speciality {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a > b && a > c){
                System.out.println("Setter");
            } else if (b > c && b > a) {
                System.out.println("Tester");
            }
            else{
                System.out.println("Editorialist");
            }
        }
    }
}

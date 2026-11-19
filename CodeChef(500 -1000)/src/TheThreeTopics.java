import java.util.Scanner;

public class TheThreeTopics {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
        if (a == x || b == x || x == c){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

import java.util.Scanner;

public class PracticeMakesUsPerfect {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
       for (int i = 0; i < 4; i++){
        int a = sc.nextInt();
        if (a >= 10){
            count++;
        }
       }
        System.out.println(count);

    }
}

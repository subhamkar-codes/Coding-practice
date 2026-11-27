import java.util.Scanner;

public class DecrementORIncrement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%4==0){
            System.out.println(++n);
        }
        else {
            System.out.println(--n);
        }
    }
}

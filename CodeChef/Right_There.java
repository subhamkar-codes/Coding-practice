import java.util.*;
import java.lang.*;
import java.io.*;
public class Right_There {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b < a){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }
    }
}

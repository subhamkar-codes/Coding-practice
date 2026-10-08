import java.util.*;
import java.lang.*;
import java.io.*;

public class Audible_Range {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++){
            long a = sc.nextLong();
            if (a >= 67 && a <= 45000 ){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}

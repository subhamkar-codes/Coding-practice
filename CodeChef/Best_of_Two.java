import java.util.*;
import java.lang.*;
import java.io.*;

public class Best_of_Two {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a >= b) {
                System.out.println(a);
            } else if (b >= a ) {
                System.out.println(b);
            }
//            else {
//                System.out.println("Both are same!!");
//            }
        }
    }
}

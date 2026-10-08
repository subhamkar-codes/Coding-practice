import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Reach_on_Time {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            if (a >= 30){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}

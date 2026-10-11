import java.util.*;
import java.lang.*;
import java.io.*;
public class Roller_Coaster {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a >= b){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}

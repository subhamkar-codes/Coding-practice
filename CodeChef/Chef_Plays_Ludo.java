import java.util.*;
import java.lang.*;
import java.io.*;
public class Chef_Plays_Ludo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0 ; i< t; i++){
            int a = sc.nextInt();
            if (a >= 1 && a <= 5){
                System.out.println("NO");
            }
            else {
                System.out.println("Yes");
            }
        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;
public class FourTickets {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            a = a*4;
            if (a <= 1000){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;
public class IPL_Ticket_Rush {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a - b;
            if (c <= 0){
                System.out.println(0);
            }
            else {
                System.out.println(c);
            }
        }
    }
}

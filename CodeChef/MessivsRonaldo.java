import java.util.*;
import java.lang.*;
import java.io.*;
public class MessivsRonaldo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = (a*2)+b;
        int c = sc.nextInt();
        int d = sc.nextInt();
        int r = (c*2)+d;
        if (m == r){
            System.out.println("Equal");
        } else if (m > r) {
            System.out.println("Messi");
        }
        else {
            System.out.println("Ronaldo");
        }
    }
}

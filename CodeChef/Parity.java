import java.util.*;
import java.lang.*;
import java.io.*;

public class Parity {
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for (int i = 0; i < n; i++){
           int a = sc.nextInt();
           if (a % 2 == 0){
               System.out.println("Yes");
           }
           else {
               System.out.println("No");
           }
       }
    }
}

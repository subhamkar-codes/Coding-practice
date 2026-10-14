import java.util.*;
import java.lang.*;
import java.io.*;


public class Total_Prize_Money {
    static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int i = 0;i < n;i++){
          int a = sc.nextInt();
         a = a*10;
         int b = sc.nextInt();
         b = b*90;
         int c = a + b;
          System.out.println(c);
      }
    }
}

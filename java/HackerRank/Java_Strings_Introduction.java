import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String j = sc.nextLine();
        String x =  j.substring(0,1).toUpperCase()+j.substring(1);


        String v = sc.nextLine();
       String y = v.substring(0,1).toUpperCase()+v.substring(1);
        int a = j.length();
        int b = v.length();
        int c = a + b;
        int d = j.compareTo(v);



        System.out.println(c);
        if (d < 0){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }

        System.out.println(x+" "+y);
    }
}

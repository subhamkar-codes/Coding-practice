import java.io.*;
import java.util.*;

public class Java_String_Reverse {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        A.length();
        for (int left = 0, right = A.length() - 1; left < right; left++, right--) {
           if (A.charAt(left) != A.charAt(right)){
               System.out.println("No");
               return;
           }

        }
        System.out.println("Yes");
    }
}

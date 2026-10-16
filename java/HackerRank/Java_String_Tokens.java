import java.io.*;
import java.util.*;

public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNext()) {
            System.out.println(0);
            return;
        }
        String s = scan.nextLine();

        
        if (s.trim().isEmpty()) {
            System.out.println(0);
            scan.close();
            return;
        }

        String[] tokens = s.trim().split("[^a-zA-Z]+");

        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }

        scan.close();
    }
}
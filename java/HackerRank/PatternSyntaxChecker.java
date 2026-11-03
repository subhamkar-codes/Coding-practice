import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCase = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < TestCase; i++) {
            String pattern = sc.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (RuntimeException e) {
                System.out.println("Invalid");
            }
        }
    }
}

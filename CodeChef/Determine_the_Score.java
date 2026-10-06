import java.util.*;
import java.lang.*;
import java.io.*;
public class Determine_the_Score {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i ++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a / 10)*b;
        System.out.println(c);
    }

    }
}

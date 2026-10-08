import java.util.*;
import java.lang.*;
import java.io.*;
public class Bone_Appetit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        int o = m*x;
        int p = n*y;

        int r = o + p;
        System.out.println(r);
    }
}

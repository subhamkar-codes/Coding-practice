import java.util.*;
import java.lang.*;
import java.io.*;

public class Puzzle_Hunt {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        if (p >= 6 && p<= 8){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

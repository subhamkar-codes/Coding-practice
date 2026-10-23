import java.util.*;
import java.lang.*;
import java.io.*;

public class WaitingTime {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            a = a* 7;
            int b = sc.nextInt();
            System.out.println(a - b);
        }
    }
}

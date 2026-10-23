import java.util.*;
import java.lang.*;
import java.io.*;
public class JustOneMoreEpisode {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            if (a > 24){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}

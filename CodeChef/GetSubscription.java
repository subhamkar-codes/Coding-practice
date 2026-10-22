import java.util.*;
import java.lang.*;
import java.io.*;
public class GetSubscription {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            if (a <= 30){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }
    }
}

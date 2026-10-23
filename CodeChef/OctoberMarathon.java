import java.util.*;
import java.lang.*;
import java.io.*;

public class OctoberMarathon {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 3){
            System.out.println("Gold");
        } else if (n >= 3 && n < 6) {
            System.out.println("Silver");
        }
        else {
            System.out.println("BRONZE");
        }
    }
}

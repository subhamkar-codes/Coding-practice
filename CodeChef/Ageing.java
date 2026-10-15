import java.util.*;
import java.lang.*;
import java.io.*;
public class Ageing {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++){
        int a = sc.nextInt();
        int CAge = 20;
        a = a - CAge;
        int CeAge = 10;
        int FAge = CeAge + a;
        System.out.println(FAge);
    }
    }
}

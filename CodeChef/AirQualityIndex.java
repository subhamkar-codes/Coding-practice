import java.util.Scanner;

public class AirQualityIndex {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a >=1 && a < 100){
        System.out.println("Yes");
    }
    else {
        System.out.println("NO");
    }
    }
}

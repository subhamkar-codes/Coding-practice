import java.util.Scanner;

public class java_loop_2 {
    static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int current = a;
                for (int j = 0; j < n; j++){
                    int result = (int) Math.pow(2,j);
                    current += result*b;
                    System.out.print(current);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
            in.close();
    }
}

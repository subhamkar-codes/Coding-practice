import java.util.Scanner;

public class ComplementaryStrandInADNA {
    static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();

                while (t-- > 0) {
                    int n = sc.nextInt();
                    String s = sc.next();
                    StringBuilder ans = new StringBuilder();

                    for (int i = 0; i < n; i++) {
                        char c = s.charAt(i);
                        if (c == 'A') ans.append('T');
                        else if (c == 'T') ans.append('A');
                        else if (c == 'C') ans.append('G');
                        else if (c == 'G') ans.append('C');
                    }
                    System.out.println(ans.toString());
                }
                sc.close();

    }
}

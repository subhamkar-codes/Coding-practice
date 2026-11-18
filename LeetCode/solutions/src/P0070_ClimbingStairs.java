
import java.util.Scanner;

class Solution70 {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;

        for (int i = 1; i < n; i++) {
            int sum = a + b;
            a = b;
            b = sum;


        }

        return b;
    }
}

public class P0070_ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        Solution70 sol = new Solution70();

        int result = sol.climbStairs(n);

        System.out.println("Total ways: " + result);

        sc.close();
    }
}

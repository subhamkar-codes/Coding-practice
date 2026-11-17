import java.util.Scanner;

//class Solution69 {
//    public int mySqrt(int x) {
//        int i =1;
//        for ( i = 1; i <= x/i; i++) {
//
//        }
//        return i-1;
//    }
//}



class Solution69 {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid == 0 || mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}


public class P0069_Sqrt_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        Solution69 sol = new Solution69();

        int result = sol.mySqrt(x);

        System.out.println("Integer square root: " + result);

        sc.close();
    }
}

import java.util.Scanner;
import java.util.Arrays;

class Solution66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] == 9){
                digits[i] = 0;
            }
            else{
                digits[i]++;
                return digits;
            }

        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;

    }
}

public class P0066_PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        System.out.println("Enter digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        Solution66 sol = new Solution66();
        int[] result = sol.plusOne(digits);

        System.out.println("Result: " + Arrays.toString(result));

        sc.close();
    }
}

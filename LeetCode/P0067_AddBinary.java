
import java.util.Scanner;

class Solution67 {
    public String addBinary(String a, String b) {
            int i = a.length()-1;
            int j = b.length()-1;
            int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0){
            int sum = carry;
            if (i >= 0){
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            int bit = sum % 2;
            carry = sum / 2;
            sb.append(bit);
            i--;
            j--;
        }
        sb.reverse();
        return sb.toString();
    }
}

public class P0067_AddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first binary string: ");
        String a = sc.nextLine();

        System.out.print("Enter second binary string: ");
        String b = sc.nextLine();

        Solution67 sol = new Solution67();

        String result = sol.addBinary(a, b);

        System.out.println("Binary sum: " + result);

        sc.close();
    }
}

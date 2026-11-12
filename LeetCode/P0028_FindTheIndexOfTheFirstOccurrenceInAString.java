
import java.util.Scanner;

class Solution28 {
    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()){
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for ( j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
            }

            if ( j == needle.length()) {
                return i;
            }

        }


        return -1;
    }
}

public class P0028_FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter haystack: ");
        String haystack = sc.nextLine();

        System.out.print("Enter needle: ");
        String needle = sc.nextLine();

        Solution28 obj = new Solution28();

        int result = obj.strStr(haystack, needle);

        System.out.println("First occurrence index: " + result);

        sc.close();
    }
}

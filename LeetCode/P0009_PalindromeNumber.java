import java.util.Scanner;

// for leet code direct solution

class Solution {
    public boolean isPalindrome(int x) {
        long rev = 0;
        int digit;
        int original = x;
        if (x < 0) {
            return false;
        }
        else {
            while (x != 0) {
                digit = x % 10;
                rev =  (rev * 10) + digit;
                x = x / 10;
            }
        }
        if (original == rev){
            return true;
        }
        else {
            return false;
        }
    }
}

public class P0009_PalindromeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        int original = a;
        int digit;
        if( a < 0) {
            System.out.println("False");
        }
        else {
            while (a != 0) {
                digit = a % 10;
                rev = (rev * 10) + digit;
                a = a / 10;
            }


            if (original == rev){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}


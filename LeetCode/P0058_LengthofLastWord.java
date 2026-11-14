import java.util.Scanner;

class Solution58 {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        int count = 0;
        for (int j = i; j >= 0 ; j--) {
            if (count == 0 && s.charAt(j) == ' '){
                continue;
            }
            else{
                if (s.charAt(j) == ' '){
                break;}
                else{
                    count++;
                }
            }
        }
        return count;
    }
}

public class P0058_LengthofLastWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Solution58 sol = new Solution58();

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Length of last word: " + sol.lengthOfLastWord(s));

        sc.close();
    }
}
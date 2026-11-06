import java.util.HashMap;
import java.util.Scanner;

class Solution13 {
    public int romanToInt(String s) {
        int total = 0;
        int nextValue = 0;
        HashMap<Character, Integer> HM = new HashMap<>();
        HM.put('I',1);
        HM.put('V',5);
        HM.put('L',50);
        HM.put('X',10);
        HM.put('C',100);
        HM.put('D',500);
        HM.put('M',1000);
        for (int i = 0; i < s.length(); i++) {
            char b =  s.charAt(i);
            int value = HM.get(b);
            nextValue = 0;
            if (i + 1 < s.length()) {
                nextValue = HM.get(s.charAt(i + 1));
            }

            if (value < nextValue){
                total -= value;
            }
            else {
                total += value;
            }

        }
        return  total;
    }
}


public class P0013_RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int total = 0;
        int nextValue = 0;
        HashMap<Character, Integer> HM = new HashMap<>();
        HM.put('I',1);
        HM.put('V',5);
        HM.put('L',50);
        HM.put('X',10);
        HM.put('C',100);
        HM.put('D',500);
        HM.put('M',1000);
        for (int i = 0; i < a.length(); i++) {
          char b =  a.charAt(i);
            int value = HM.get(b);
            nextValue = 0;
            if (i + 1 < a.length()) {
                nextValue = HM.get(a.charAt(i + 1));
            }

            if (value < nextValue){
                total -= value;
            }
            else {
                total += value;
            }

        }
        System.out.println(total);
        Solution13 sol = new Solution13();
        int result = sol.romanToInt(a);
        System.out.println(result);
    }
}

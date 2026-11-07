import java.util.Scanner;
class Solution14 {
    public String longestCommonPrefix(String[] strs) {

        int min = strs[0].length();

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }

        for (int i = 0; i < min; i++) {
            char a = strs[0].charAt(i);

            for (int j = 0; j < strs.length; j++) {
                if (a != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0].substring(0, min);
    }
}



public class P0014_LongestCommonPrefix {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.next();
        }
        int min = arr[0].length();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < min){
                min = arr[i].length();
            }
        }
        for (int i = 0; i < min; i++) {
            if (flag == false){

                break;
            }
            else {
                char a = arr[0].charAt(i);
                for (int j = 0; j < arr.length; j++) {
                    if (a != arr[j].charAt(i)) {
                        System.out.println(arr[0].substring(0,i));
                        flag = false;
                        break;

                    }
                }
            }
        }
        if (flag == true){
            System.out.println(arr[0].substring(0, min));
        }
    }
}

import java.io.*;
import java.util.*;

public class Java_Anagrams {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();
        int [] fre = new int[26];
        for (int i = 0; i < a.length() ; i++){
            fre[a.charAt(i)-'a']++;
        }
        for(int i = 0; i < b.length(); i++){
            fre[b.charAt(i)-'a']--;
        }
        boolean isAnagram = true;

        for (int i = 0; i <fre.length;i++){
        if (fre[i] != 0){
            isAnagram = false;
            break;
        }
        }
        if (isAnagram){
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
    }
}

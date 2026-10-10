import java.io.*;
import java.util.*;

public class Java_Substring_Comparisons {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <=s.length() - k; i++){
            String current = s.substring(i,i+k);

        if (current.compareTo(smallest) < 0){
            smallest = current;
        } else if (current.compareTo(largest) > 0) {
            largest = current;
        }

        }

        System.out.println(smallest);
        System.out.println(largest);



    }
}

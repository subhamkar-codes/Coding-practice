import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_end_of_file {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(lineNumber+" "+line);
            lineNumber++;

        }
    }
}

import java.io.*;
import java.text.NumberFormat;
import java.util.*;
public class Java_Currency_Formatter {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);


        NumberFormat ind = NumberFormat.getCurrencyInstance(new Locale("en" , "IN"));
        String cusIND = "Rs." + ind.format(r).replaceAll("[^0-9.,]","");




        NumberFormat cha = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chinaStr = cha.format(r).replace("¥", "￥");

        NumberFormat fra = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: "+us.format(r));
        System.out.println("India: "+cusIND);
        System.out.println("China: " +chinaStr);
        System.out.println("France: " +fra.format(r));

    }
}

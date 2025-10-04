import java.io.*;
import java.util.Scanner;
import java.lang.StringBuilder;

public class NtoMakeM {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while (t--> 0) {

            String x = sc.next();
            int digit = x.charAt(0) - '0';
            int length = x.length();

            int res = (digit - 1) * 10 + (length * (length + 1)) / 2;

            System.out.println(res);
            

        }


    }


}
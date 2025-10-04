import java.util.Scanner;

public class chewbeccaAndNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        String s = String.valueOf(n);
        char[] charArr = s.toCharArray();

        for (int i = 0;i < charArr.length;i++) {

            int cur = charArr[i] - '0';

            if (i != 0 && cur == 9) {
                charArr[i] = '0';
            }

            if (cur > 4 && cur < 9) {
                charArr[i] = (char) ((9 - cur) + '0');
            }

        }

        String newStr = new String(charArr);

        //91230320
        System.out.print(Long.parseLong(newStr));

    }
}

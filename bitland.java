import java.util.*;

public class bitland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String current = "";
        int x = 0;
        while (n -- > 0) {

            current = scanner.next();

            if (current.equals("X++") || current.equals("++X")) {
                x++;
            }

            if (current.equals("X--") || current.equals("--X")) {
                x--;
            }

        }

        System.out.print(x);

        
        
    }
}
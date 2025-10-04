import java.util.Scanner;

public class BeutifulMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[5][5];

        for (int i = 0;i < 5;i++) {
            for (int j = 0;j < 5;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int x = -1;
        int y = -1;
        for (int i = 0;i < 5;i++) {
            for (int j = 0;j < 5;j++) {

                if (matrix[i][j] == 1) {
                    x = i;
                    y = j;
                }

            }
        }

        int score = 0;

        score += Math.abs(2 - x);
        score += Math.abs(2 - y);

        System.out.println(score);

    }
    
}

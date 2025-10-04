import java.util.Scanner;

public class softdrinking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();


        int totalDrinks = k * l;
        int totalslices = c * d;
        
        int drinkToasts = totalDrinks / nl;
        int saltToasts = p / np;

        int minOfDAndSa = Math.min(drinkToasts,saltToasts);
        int minOfMinAndSli = Math.min(minOfDAndSa,totalslices);

        

        System.out.println(minOfMinAndSli /  n);



    }

}
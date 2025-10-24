import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t-- > 0) {

      solve(sc);

    }

    sc.close();

  }



  public static void solve(Scanner sc) {

     int n = sc.nextInt();
			long[] arr = new long[n];
      for (int i = 0;i < n;i++) {
        arr[i] = sc.nextLong();
      }

      Arrays.sort(arr);

      long maxDiff = arr[n - 1] - arr[0];

      for (int i = 1;i < n;i++) {

        maxDiff = Math.max(maxDiff,arr[i] - arr[0]);

      }
      for (int i = 0;i < n - 1;i++) {

        maxDiff = Math.max(maxDiff,arr[n - 1] - arr[i]);

      }

      for (int i = 0;i < n - 1;i++) {
        maxDiff = Math.max(maxDiff,arr[i] - arr[i + 1]);
      }

      System.out.println(maxDiff);


  }

  

}
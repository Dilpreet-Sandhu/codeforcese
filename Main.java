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

    int one = 0; 
    int minus = 0;

    for (int i = 0;i < n;i++) {
      int x = sc.nextInt();
      if (x == -1) {
        minus++;
      }else {
        one++;
      }
    }

    if (minus > one) {

      int cnt = 0;
      while (minus > one) {
        minus--;
        one++;
        cnt++;
      }

      System.out.println(cnt);
      return;
    }

    System.out.println(0);
    
  }
  

 



  
  
}
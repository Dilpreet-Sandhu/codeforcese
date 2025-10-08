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
    int[] arr = new int[n];
    boolean allSame = true;
    for (int i = 0;i < n;i++) {

      arr[i] = sc.nextInt();

      if (i > 0 && arr[i - 1] != arr[i]) allSame = false;

    }
    
    if (allSame) {
      System.out.println("NO");
      return;
    }

    reverse(arr,n);

    if (arr[0] == arr[1]) {
      for (int i = 2;i < n;i++) {
        if (arr[i] != arr[0]) {
          int temp = arr[i];
          arr[i] = arr[1];
          arr[1] = temp;
          break;
        }
      }
    }

    System.out.println("YES");
    for (int i : arr) System.out.print(i + " ");
    System.out.println();

    
    
}

public static void reverse(int[] arr,int n) {
  int i = 0;
  int j = n - 1;
  while (i <= j) {

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    i++;
    j--;

  }
}

  

 



  
  
}
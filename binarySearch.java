import java.util.*;

public class binarySearch {

    public static int findPeak(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (mid == right) return arr[right];

            if (arr[mid] == arr[mid + 1] || arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            }

            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            }

        }

        return left;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(findPeak(arr));
    
    }


}


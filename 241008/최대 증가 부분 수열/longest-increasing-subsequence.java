import java.util.*;
public class Main {
    public static int binarySearch(int[] arr, int left, int right, int k, int size) {
        while (left<right) {
            int mid = (left + right)/2;
            if (arr[mid] >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return (left == size) ? -1 : right;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        int lis = 0;

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            int idx = binarySearch(dp, 0, lis+1, arr[i], lis+1);
            if (idx==-1) dp[lis++] = arr[i];
            else dp[idx] = arr[i];
        }
        System.out.println(lis);
    }
}
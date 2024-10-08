import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dp = new int[m+1];
        int[] nums = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);

        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        dp[0] = 0;
        for(int i=0; i<n; i++) {
            for(int j=m; j>=1; j--) {
                if (j < nums[i]) continue;
                if (dp[j - nums[i]] == Integer.MAX_VALUE) continue;
                dp[j] = Math.min(dp[j], dp[j - nums[i]] + 1);
            }
        }
        int answer = dp[m] == Integer.MAX_VALUE ? -1 : dp[m];
        System.out.println(answer);
    }
}
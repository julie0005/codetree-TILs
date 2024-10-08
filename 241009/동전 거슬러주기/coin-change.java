import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dp = new int[m+1];
        int[] coins = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);

        for (int i=0; i<n; i++) {
            coins[i] = sc.nextInt();
        }

        dp[0] = 0;
        for(int i=1; i<=m; i++) {
            for(int j=0; j<n; j++) {
                if (i >= coins[j]) {
                    if (dp[i - coins[j]] == Integer.MAX_VALUE) continue;
                    dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
                }
            }
        }
        int answer = dp[m] == Integer.MAX_VALUE ? -1 : dp[m];
        System.out.println(answer);
    }
}
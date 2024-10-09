import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dp = new int[m+1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        Crystal[] crystals = new Crystal[n];

        for(int i=0; i<n; i++) {
            crystals[i] = new Crystal(sc.nextInt(), sc.nextInt());
        }
        dp[0] = 0;
    
        for(Crystal crystal : crystals) {
            for (int i=m; i>=0; i--) {
                if (crystal.weight > i) continue;
                if (dp[i - crystal.weight] == Integer.MIN_VALUE) continue;
                dp[i] = Math.max(dp[i], dp[i - crystal.weight] + crystal.value);
            }
        }
        int answer = dp[m] == Integer.MIN_VALUE ? 0 : dp[m];
        System.out.println(answer);
    }
}

class Crystal {
    int weight;
    int value;
    Crystal(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}
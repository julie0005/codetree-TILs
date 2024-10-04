import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] board = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        boolean allPositive = true;
        for(int height = n; height >= 1; height--) {
            for (int width = m; width>= 1; width--) {
                for (int hs = 0; hs + height <= n; hs++) {
                    for (int ws = 0; ws + width <= m; ws++) {
                        int he = hs + height;
                        int we = ws + width;
                        allPositive = true;
                        for (int i = hs; i < he; i++) {
                            for (int j = we; j < we; j++) {
                                if (board[i][j] < 0) {
                                    allPositive = false;
                                    break;
                                }
                            }
                            if (!allPositive) break;
                        }
                        if (allPositive) {
                            System.out.println(width * height);
                            break;
                        }
                    }
                    if (allPositive) break;
                }
                if (allPositive) break;
            }
            if (allPositive) break;
        }
    }
}
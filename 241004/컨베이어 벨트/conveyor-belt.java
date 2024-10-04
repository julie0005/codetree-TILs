import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Queue<Integer> up = new LinkedList<>();
        Queue<Integer> down = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] ups = new int[n];
        int[] downs = new int[n];
        for (int i=0; i<n; i++) {
            ups[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            downs[i] = sc.nextInt();
        }

        for (int i=n-1; i>=0; i--) {
            up.add(ups[i]);
            down.add(downs[i]);
        }

        int currentTime = 0;
        while (currentTime++ < t) {
            int temp = up.remove();
            down.add(temp);
            temp = down.remove();
            up.add(temp);
        }

        for (int i=0; i<n; i++) {
            ups[n - i - 1] = up.remove();
            downs[n - i - 1] = down.remove();
        }
        for (int i=0; i<n; i++) {
            System.out.print(ups[i] + " ");
        }
        System.out.println();
        for (int i=0; i<n; i++) {
            System.out.print(downs[i] + " ");
        }
    }
}
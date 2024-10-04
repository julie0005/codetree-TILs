import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] belt = new int[n*2];

        for(int i=0; i<n; i++) {
            belt[i + n] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            belt[i] = sc.nextInt();
        }

        int cur = 0;
        while(cur++ < t) {
            int temp = belt[2*n - 1];
            for (int i=2*n-2; i>=0; i--) {
                belt[i+1] = belt[i];
            }
            belt[0] = temp;
        }

        for(int i=0; i<n; i++) {
            System.out.print(belt[i + n] + " ");
        }
        System.out.println();
        for(int i=0; i<n; i++) {
            System.out.print(belt[i] + " ");
        }

    }
}
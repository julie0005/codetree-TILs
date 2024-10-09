import java.util.*;
public class Main {
    static int N;
    static List<Integer> seq = new ArrayList<>();
    static boolean[] visited;
    static void print() {
        String str = "";
        for (int i=0; i<seq.size(); i++) {
            str += seq.get(i);
            if (i<seq.size()-1) str+=" ";
        }
        System.out.println(str);
    }

    static void permutation(int depth) {
        if (depth == N) {
            print();
            return;
        }

        for(int i=1; i<=N; i++) {
            if (visited[i-1]) continue;
            visited[i-1]=true;
            seq.add(i);
            permutation(depth+1);
            seq.remove(seq.size()-1);
            visited[i-1] = false;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visited = new boolean[N];
        permutation(0);
    }
}
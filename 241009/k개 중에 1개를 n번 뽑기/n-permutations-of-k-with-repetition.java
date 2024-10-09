import java.util.*;
public class Main {
    static List<String> pairs = new ArrayList<>();
    static List<Integer> seq = new ArrayList<>();
    static int K, N;
    static void addToPairs() {
        String str = "";
        for (int i=0; i<seq.size(); i++) {
            str += seq.get(i);
            if (i<seq.size()-1) str+=" ";
        }
        pairs.add(str);
    }
    static void choose(int idx) {
        if (idx == N) {
            addToPairs();
            return;
        }

        for (int i=1; i<=K; i++) {
            seq.add(i);
            choose(idx+1);
            seq.remove(seq.size() - 1);
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        choose(0);
        Collections.sort(pairs);
        for(String pair : pairs) {
            System.out.println(pair);
        }
    }
}
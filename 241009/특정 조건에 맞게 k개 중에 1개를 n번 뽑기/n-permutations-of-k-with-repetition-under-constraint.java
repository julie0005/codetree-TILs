import java.util.*;
public class Main {
    static int K,N;
    static List<String> seqs = new ArrayList<>();
    static List<Integer> num = new ArrayList<>();

    static void addToSeqs() {
        String str = "";
        for (int i=0; i<num.size(); i++) {
            str += num.get(i);
            if (i<num.size()-1) str+=" ";
        }
        seqs.add(str);
    }
    static void choose(int idx) {
        if (idx == N) {
            addToSeqs();
            return;
        }

        for(int i=1; i<=K; i++) {
            if (num.size() >= 2) {
                int curNum = i;
                boolean combo = true;
                for(int j=idx-2; j<idx; j++) {
                    if (num.get(j) != curNum) {
                        combo = false;
                        break;
                    }
                }
                if (combo) continue;
            }
            
            num.add(i);
            choose(idx+1);
            num.remove(num.size()-1);
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        choose(0);
        Collections.sort(seqs);
        for (String seq : seqs) {
            System.out.println(seq);
        }

    }
}
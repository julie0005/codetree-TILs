import java.util.*;
public class Main {
    static List<Integer> num = new ArrayList<>();
    static int K,N;
    static void addToSeqs() {
        String str = "";
        for (int i=0; i<num.size(); i++) {
            str += num.get(i);
            if (i < num.size()-1) str+=" ";
        }
        System.out.println(str);
    }
    static void choose(int idx, int lastNum) {
        if (idx == N) {
            addToSeqs();
            return;
        }

        for(int i=1; i<=K; i++) {
            if (i <= lastNum) continue;
            num.add(i);
            choose(idx+1, i);
            num.remove(num.size()-1);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        choose(0, 0);
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int size = str.length();
        int startIdx = 0;
        int startInit = 0;
        int min = Integer.MAX_VALUE;
        do {
            int idx = startIdx;
            int endIdx = (startIdx + size - 1) % size;
            char curChar = str.charAt(idx);
            int sum = 0;
            String zipped = "";
            do {
                if (str.charAt(idx) == curChar) {
                    sum++;
                }
                else {
                    zipped += String.valueOf(curChar) + String.valueOf(sum);
                    curChar = str.charAt(idx);
                    sum = 1;
                }
                if (idx == endIdx) {
                    zipped += String.valueOf(curChar) + String.valueOf(sum);
                }
                idx = (idx + 1) % size;
            } while (idx != startIdx);
            min = Math.min(min, zipped.length());
            startIdx = (startIdx + 1) % size;
        } while (startIdx != startInit);

        System.out.println(min);
    }
}
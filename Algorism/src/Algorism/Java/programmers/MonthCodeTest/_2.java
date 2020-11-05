package Algorism.Java.programmers.MonthCodeTest;

import java.util.Arrays;

public class _2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];
        int len;
        int cnt = 0;
        int resCnt = 0;
        while (s.length() != 1) {
            len = s.length();
            s = s.replaceAll("0", "");
            cnt += len - s.length();
            s = Integer.toBinaryString(s.length());
            resCnt++;
        }

        answer[0] = resCnt;
        answer[1] = cnt;


        return answer;
    }
}

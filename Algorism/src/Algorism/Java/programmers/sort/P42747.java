package Algorism.Java.programmers.sort;

public class P42747 {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        for (int i = 0; i <= n; i++) {
            int cnt = 0;
            for( int citation : citations) {
                if (citation >= i)
                    cnt++;
            }
            if (i >= cnt && n - cnt <= i)
                answer = Math.max(answer, cnt);
        }
        return answer;
    }
}

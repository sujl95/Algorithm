package Algorithm.Java.programmers.MonthCodeTest;

public class P68935 {
    public static void main(String[] args) {
        System.out.println(solution(125));
    }

    public static int solution(int n) {
        int answer = 0;
        String str = "";
        while (n > 0) {
            str += ""+(n%3);
            n /= 3;
        }
        int cnt = 1;
        for (int i = str.length()-1; i >= 0; i--){
            int c = Integer.parseInt(str.charAt(i)+"");
            if (i == str.length()-1) {
                answer += c;
                continue;
            }
            answer += Math.pow(3, cnt) * c;
            cnt++;
        }

        return answer;
    }
}

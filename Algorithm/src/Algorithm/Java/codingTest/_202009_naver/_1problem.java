package Algorithm.Java.codingTest._202009_naver;

import java.util.Scanner;

public class _1problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int[] p = {5, 4, 7, 2, 0, 6};
        int[] c = {4, 6, 4, 9, 2, 3};
        int n1 = 7;
        int[] p1 = {6, 2, 1, 0, 2, 4, 3};
        int[] c1 = {3, 6, 6, 2, 3, 7, 6};
        solution(n1,p1,c1);
        solution(n,p,c);

    }

    public static String solution(int n, int[] p, int[] c){
        String answer ="";
        int money = 100;
        int tMoney = 0;
        int day = 0;
        int cnt = 0;
        int pCnt = 0;
        for (int i = 0; i < n; i++) {
            pCnt = p[i] + pCnt;
            System.out.println("pCnt=" + pCnt);
            if (pCnt >= c[i]) {
                day++;
                pCnt = pCnt - c[i];
                tMoney = tMoney + c[i] * money;
                cnt = 0;
                money = 100;
            } else {
                cnt++;
                money /= 2;
            }
            if (cnt == 3 || i == n - 1) {
                tMoney = tMoney / (i + 1);
                break;
            }
        }
        answer = String.format("%.2f", (float)tMoney);
        System.out.println(answer);
        return answer;

    }

}

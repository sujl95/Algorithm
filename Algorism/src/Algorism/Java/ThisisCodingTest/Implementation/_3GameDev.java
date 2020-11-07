package Algorism.Java.ThisisCodingTest.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class _3GameDev {
    private static int[] xyArr,xyChar;
    private static int cnt = 0;
    private static int length;
    private static int[] dx = {-1,0,1,0};
    private static int[] dy = {0,1,0,-1};
    private static int[][] arr,dp;
    private static int[] point = new int[2];
    private static int Direction ;

    public static void main(String[] args) {
        System.out.println(solution());
    }

    public static int solution() {
        Scanner sc = new Scanner(System.in);
        xyArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        xyChar = Arrays.stream(sc.nextLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        point[0] = xyChar[0];
        point[1] = xyChar[1];
        Direction = xyChar[2];
        length = xyArr[0];
        arr = new int[length][length];
        dp = new int[length][length];

        for (int loop = 0; loop < length; loop++) {
            arr[loop] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        }
        //돌은 횟수
        int turnCnt =0;
        //현재 위치 증가
        while (true) {
            //왼쪽으로 돌리기
            turnLeft();
            int x = point[0] + dx[Direction]; //x + 방위
            int y = point[1] + dy[Direction]; //y + 방위
            if (dp[x][y] == 0 && arr[x][y] == 0) {
                dp[x][y] = 1; //바다가 아니면 체크
                point[0] = x; //이동
                point[1] = y; //이동
                cnt++; // 증가
                turnCnt = 0; //돌은 횟수 초기화
                continue;
            } else {
                turnCnt++; //돌은 횟수 증가
            }
            if (turnCnt == 4) { //다 돌았을 시
                x = point[0] - dx[Direction];
                y = point[1] - dy[Direction];
                //뒤로 이동할 수 있으면 포인트 다시 지정
                if (arr[x][y] == 0) {
                    point[0] = x;
                    point[1] = y;
                    turnCnt = 0;
                } else {
                    //할 수 없으면 종료
                    break;
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return cnt;
    }

    public static void turnLeft() {
        Direction--;
        if(Direction == -1) Direction = 3;
    }
}

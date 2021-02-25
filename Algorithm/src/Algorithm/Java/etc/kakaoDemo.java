package Algorithm.Java.etc;

import java.util.*;

public class kakaoDemo {

	public static void main(String[] args) {

		int[][] v = {{1, 4}, {3, 4}, {3, 10}};
		int[][] v1 = {{3, 4}, {3, 10}, {1, 4}};
		int[][] t = {{1, 1}, {2, 2}, {1, 2}};
		System.out.println(Arrays.toString(solution(v1)));
	}
	
	
    public static int[] solution(int[][] v) {
        int[] xArr = new int[3];
        int[] yArr = new int[3];
        int x = 0,y =0;
        for (int i = 0; i< v.length; i++) {
			xArr[i] = (v[i][0]);
			yArr[i] = (v[i][1]);
        }
		Arrays.sort(xArr);
		Arrays.sort(yArr);
		for (int i = 0; i < 3; i++) {
			int xCnt = 0;
			int yCnt = 0;
			for (int j = 0; j < 3; j++) {
				if (xArr[i] == xArr[j]) {
					xCnt++;
				}
				if (yArr[i] == yArr[j]) {
					yCnt++;
				}
			}
			if (xCnt == 1) {
				x = xArr[i];
			}
			if (yCnt == 1) {
				y = yArr[i];
			}
		}
		return new int[] {x, y};
    }
}

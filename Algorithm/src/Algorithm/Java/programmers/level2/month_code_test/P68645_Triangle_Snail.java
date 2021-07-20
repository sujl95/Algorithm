package Algorithm.Java.programmers.level2.month_code_test;

import java.util.Arrays;

public class P68645_Triangle_Snail {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(4)));
	}

	public static int[] solution(int n) {
		int[][] map = new int[n][n];
		int x = 0;
		int y = 0;
		map[0][0] = 1;
		int max = n * (n + 1) / 2;
		int[] answer = new int[max];
		int count = 1;
		while (count < max) {
			while (x + 1 < n && 0 == map[x + 1][y]) {
				map[++x][y] = ++count;
			}
			while (y + 1 < n && 0 == map[x][y + 1] ) {
				map[x][++y] = ++count;
			}
			while (x - 1 > 0 && 0 == map[x - 1][y - 1]) {
				map[--x][--y] = ++count;
			}
		}
		int pos = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 0) {
					break;
				}
				answer[pos++] = map[i][j];
			}
		}
		return answer;
	}
}

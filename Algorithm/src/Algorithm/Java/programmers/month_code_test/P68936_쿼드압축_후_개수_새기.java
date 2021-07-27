package Algorithm.Java.programmers.month_code_test;

import java.util.Arrays;

public class P68936_쿼드압축_후_개수_새기 {

	private static int[] answer = new int[2];

	public static void main(String[] args) {
		int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}};
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static int[] solution(int[][] arr) {
		dfs(arr, arr.length, 0, 0);
		return answer;
	}

	private static void dfs(int[][] arr, int N, int x, int y) {
		boolean isZero = true;
		boolean isOne = true;
		for (int i = x; i < x + N; i++) {
			for (int j = y; j < y + N; j++) {
				if (arr[i][j] == 1) {
					isZero = false;
				}
				if (arr[i][j] == 0) {
					isOne = false;
				}
			}
		}
		if (isOne) {
			answer[1]++;
			return;
		}
		if (isZero) {
			answer[0]++;
			return;
		}
		N /= 2;
		dfs(arr, N, x, y);
		dfs(arr, N, x + N, y);
		dfs(arr, N, x, y + N);
		dfs(arr, N, x + N, y + N);
	}

}

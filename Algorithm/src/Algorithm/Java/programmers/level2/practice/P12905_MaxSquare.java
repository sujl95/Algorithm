package Algorithm.Java.programmers.level2.practice;

import java.util.Arrays;

public class P12905_MaxSquare {

	private static int[][] dp;

	public static void main(String[] args) {
		// System.out.println(
		// 		"solution() = " + solution(new int[][] {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}}));
		// System.out.println();
		System.out.println(solution(new int[][] {{1, 1}, {1, 0}}));


	}

	public static int solution(int[][] board) {
		dp = new int[board.length][board[0].length];
		int answer = 0;
		for (int i = 0; i < dp.length; i++) {
			if (board[i][0] == 1) {
				dp[i][0] = 1;
				answer = 1;
			}
		}
		for (int i = 0; i < dp[0].length; i++) {
			if (board[0][i] == 1) {
				dp[0][i] = 1;
				answer = 1;
			}
		}
		System.out.println("dp = " + Arrays.deepToString(dp));
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (board[i][j] == 1) {
					dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j])) + 1;
					answer = Math.max(answer, dp[i][j]);
				}
			}
		}
		return answer * answer;
	}
}

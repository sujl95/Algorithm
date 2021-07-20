package Algorithm.Java.backjun.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J1915_G5 {

	private static int[][] dp;
	private static int[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = input[0];
		int m = input[1];
		map = new int[n][m];
		dp = new int[n][m];
		int answer = 0;
		for (int i = 0; i < n; i++) {
			map[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
		}
		for (int i = 0; i < n; i++) {
			if (map[i][0] == 1) {
				dp[i][0] = 1;
				answer = 1;
			}
		}
		for (int i = 0; i < m; i++) {
			if (map[0][i] == 1) {
				dp[0][i] = 1;
				answer = 1;
			}
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (map[i][j] == 1) {
					dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
				}
				answer = Math.max(answer, dp[i][j]);
			}
		}
		System.out.println(answer * answer);
	}
}

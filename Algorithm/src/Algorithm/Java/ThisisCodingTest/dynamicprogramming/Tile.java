package Algorithm.Java.ThisisCodingTest.dynamicprogramming;

public class Tile {

	public static void main(String[] args) {
		int N = 3;

		int[] dp = new int[1001];

		dp[1] = 1;
		dp[2] = 3;
		for (int i = 3; i <= N; i++) {
			dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 796796;
		}

		System.out.println(dp[N]);
	}

}

package Algorithm.Java.ThisisCodingTest.dynamicprogramming;

public class _1Make {

	public static void main(String[] args) {

		int N = 26;

		int[] dp = new int[30001];


		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i - 1] + 1;

			if ((i % 2) == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			}

			if ((i % 3) == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}
			if ((i % 5) == 0) {
				dp[i] = Math.min(dp[i], dp[i / 5] + 1);
			}
		}

		System.out.println(dp[N]);
	}
}

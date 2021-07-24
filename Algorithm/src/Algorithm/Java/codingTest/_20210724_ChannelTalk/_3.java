package Algorithm.Java.codingTest._20210724_ChannelTalk;

public class _3 {

	public static void main(String[] args) {
		System.out.println("solution(8) = " + solution(8));
	}

	public static long solution(int n) {
		if (n == 2) {
			return 1;
		}
		if (n == 3) {
			return 2;
		}
		long[] dp = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			dp[i] = i;
		}
		for (int i = 2; i <= n; i++) {
			int j = 0;
			int k = i;
			while (j <= k) {
				dp[i] = Math.max(dp[i], dp[j] * dp[k]);
				j++;
				k--;
			}
		}
		return dp[n];
	}

}

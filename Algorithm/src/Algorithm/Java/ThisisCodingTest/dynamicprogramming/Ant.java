package Algorithm.Java.ThisisCodingTest.dynamicprogramming;

public class Ant {

	public static void main(String[] args) {
		int N = 4;
		int[] arr = {1, 3, 1, 5};

		int[] dp = new int[100];

		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < N; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
		}
		System.out.println(dp[N - 1]);
	}

}

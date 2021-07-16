package Algorithm.Java.backjun.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J11726_New {

	private static int[] dp = new int[1001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(tile(N));
	}

	private static int tile(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		return dp[n] = (tile(n - 1) + tile(n - 2)) % 10007;
	}

}

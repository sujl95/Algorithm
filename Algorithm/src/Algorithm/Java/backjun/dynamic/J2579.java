package Algorithm.Java.backjun.dynamic;

import java.util.Scanner;

public class J2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] dp = new int[length + 1];
		int[] stairs = new int[length + 1];
		for (int i = 1; i <= length; i++) {
			stairs[i] = sc.nextInt();
		}
		dp[1] = stairs[1];
		if (length >= 2) {
			dp[2] = stairs[1] + stairs[2];
		}
		for (int i = 3; i <= length; i++) {
			dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];
		}
		System.out.println(dp[length]);
	}
}

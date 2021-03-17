package Algorithm.Java.backjun.dynamic;

import java.util.Scanner;
import java.util.stream.IntStream;

public class J2579_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] dp = new int[length + 1];
		int[] stairs = new int[length + 1];
		IntStream.rangeClosed(1, length).forEach(i -> stairs[i] = sc.nextInt());
		dp[1] = stairs[1];
		if (length >= 2) {
			dp[2] = stairs[1] + stairs[2];
		}
		IntStream.rangeClosed(3, length)
				.forEach(i -> dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i]);
		System.out.println(dp[length]);
	}
}

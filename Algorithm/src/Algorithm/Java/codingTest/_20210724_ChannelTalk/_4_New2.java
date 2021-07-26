package Algorithm.Java.codingTest._20210724_ChannelTalk;

import java.util.Arrays;

public class _4_New2 {

	public static void main(String[] args) {
		System.out.println("solution() = " + solution(4, 2, "GBBG"));
	}

	public static int solution(int n, int k, String bulbs) {
		char[] rgb = {'R', 'G', 'B'};
		int[] arr = new int[n];
		int[] dp = new int[n + k];
		int answer = 0;
		for (int i = 0; i < n; i++) {
			char c = bulbs.charAt(i);
			for (int j = 0; j < rgb.length; j++) {
				if (c == rgb[j]) {
					arr[i] = j + 1;
					break;
				}
			}
			int change = dp[i + k - 1] - dp[i];
			int changeValue = (arr[i] + change) % 3;
			if (changeValue == 1) {
				dp[i + k] = dp[i + k - 1];
				continue;
			}
			int value = (4 - changeValue) % 3;
			dp[i + k] = dp[i + k - 1] + value;
			answer += value;
		}
		for (int i = dp.length - 1; i > dp.length - k ; i--) {
			int change = dp[i - 1] - dp[i - k];
			int changedValue = (arr[i - k] + change) % 3;
			if (changedValue != 1) {
				return -1;
			}
		}
		System.out.println("arr = " + Arrays.toString(arr));
		return answer;
	}

}

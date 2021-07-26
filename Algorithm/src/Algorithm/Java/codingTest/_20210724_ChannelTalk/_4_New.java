package Algorithm.Java.codingTest._20210724_ChannelTalk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _4_New {

	public static void main(String[] args) {
		System.out.println("solution() = " + solution(6, 3, "RBGRGB"));
	}

	public static int solution(int n, int k, String bulbs) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('R', 1);
		map.put('G', 2);
		map.put('B', 3);
		int[] arr = new int[n];
		int[] dp = new int[n + k];
		int answer = 0;
		for (int i = 0; i < n; i++) {

			// 1. 왼쪽부터 보면서 빨간색으로 바꾼다
			arr[i] = map.get(bulbs.charAt(i)); // 현재 값
			int change = dp[i - 1 + k] - dp[i]; // 지금까지 바뀐값
			int changedValue = (arr[i] + change) % 3; // 바꿔준 값 % 3 나머지 값
			if (changedValue % 3 == 1) {
				dp[i + k] = dp[i + k - 1];
				continue;
			}
			int value = ((4 - changedValue) % 3); // 바뀌어야 하는 횟수
			dp[i + k] = dp[i + k - 1] + value;
			answer += value;
		}
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("dp = " + Arrays.toString(dp));
		for (int i = dp.length - 1; i >= dp.length - (k - 1); i--) {
			int change = dp[i - 1] - dp[i - k];
			int changedValue = (arr[i - k] + change) % 3;
			if(changedValue % 3 != 1){
				return -1;
			}
		}
		return answer;
	}

}

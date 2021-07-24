package Algorithm.Java.codingTest._20210724_ChannelTalk;

import java.util.HashMap;
import java.util.Map;

public class _4_New {

	public static void main(String[] args) {
		System.out.println("solution() = " + solution(3, 2, "BGG"));
	}

	public static int solution(int n, int k, String bulbs) {
		Map<Character, Integer> map = new HashMap<>();
		Map<Integer, Character> map2 = new HashMap<>();
		map.put('R', 1);
		map.put('G', 2);
		map.put('B', 3);
		map2.put(1, 'R');
		map2.put(2, 'G');
		map2.put(0, 'B');
		int[] arr = new int[n];
		int[] dp = new int[n + k];
		int answer = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = map.get(bulbs.charAt(i));
			int change = dp[i - 1 + k] - dp[i];
			int changedValue = (arr[i] + change) % 3;
			if (changedValue % 3 == 1) {
				dp[i + k] = dp[i + k - 1];
				continue;
			}
			int value = ((4 - changedValue) % 3);
			dp[i + k] = dp[i + k - 1] + value;
			answer += value;
		}
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

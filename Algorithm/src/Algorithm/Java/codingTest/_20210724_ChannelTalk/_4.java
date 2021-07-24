package Algorithm.Java.codingTest._20210724_ChannelTalk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _4 {

	public static void main(String[] args) {
		System.out.println("solution() = " + solution(3, 2, "BGG"));
	}

	public static int solution(int n, int k, String bulbs) {
		Map<Character, Character> map = new HashMap<>();
		map.put('R', 'G');
		map.put('G', 'B');
		map.put('B', 'R');
		char[] arr = bulbs.toCharArray();
		int answer = 0;
		for (int i = 0; i < n; i++) {
			char c = arr[i];
			if (c != 'R') {
				for (int j = i; j < i + k; j++) {
					if (j < n) {
						char c1 = arr[j];
						arr[j] = map.get(c1);
					} else {
						break;
					}
				}
				answer++;
				i--;
			}
		}
		if (arr[arr.length - 1] != 'R') {
			return -1;
		}
		return answer;
	}
}

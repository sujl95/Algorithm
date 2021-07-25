package Algorithm.Java.programmers.level2.summer_winter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P12981_English_word_end {

	public static void main(String[] args) {
		String[] arr = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		String[] arr1 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
				"establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		String[] arr2 = {"hello", "one", "even", "never", "now", "world", "draw"};
		System.out.println("solution() = " + Arrays.toString(solution(2, arr2)));
	}

	public static int[] solution(int n, String[] words) {
		int[] answer = new int[] {0, 0};
		Map<String, Integer> map = new HashMap<>();
		char tempC = 'a';
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			Integer value = map.get(word);
			if (value == null) {
				map.put(word, 0);
			} else {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
				break;
			}
			char startC = word.charAt(0);
			char endC = word.charAt(word.length() - 1);
			if (tempC != startC && i > 0) {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
				break;
			} else {
				tempC = endC;
			}
		}
		return answer;
	}

}

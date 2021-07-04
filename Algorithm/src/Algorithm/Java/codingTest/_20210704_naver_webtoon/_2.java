package Algorithm.Java.codingTest._20210704_naver_webtoon;

import java.util.Arrays;
import java.util.Objects;

public class _2 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("abcdef")));
	}

	public static String[] solution(String s) {
		String[] answer = new String[s.length()];
		String[] temp = new String[s.length()];
		int pos = 0;
		int tempPos = 0;
		for (int i = 0; i < s.length() / 2; i++) {
			int cnt = 1;
			for (int j = i; j < s.length() / 2; j++) {
				String start = s.substring(i, i + cnt);
				String end = s.substring(s.length() - cnt - i , s.length() - i);
				if (start.equals(end)) {
					answer[pos] = start;
					pos++;
					i = j;
					break;
				}
				if (j == s.length() / 2 - 1) {
					temp[tempPos] = start + end;
					tempPos++;
					break;
				}
				cnt++;
			}
		}
		answer = Arrays.stream(answer).filter(Objects::nonNull).toArray(String[]::new);
		temp = Arrays.stream(temp).filter(Objects::nonNull).toArray(String[]::new);
		String[] res = new String[answer.length * 2 + 1];
		int resPos = 0;
		for (int i = 0; i < answer.length; i++) {
			res[resPos] = answer[i];
			resPos++;
		}
		if (temp.length != 0) {
			res[resPos] = temp[0];
			resPos++;
		}
		for (int i = answer.length - 1; i >= 0; i--) {
			res[resPos] = answer[i];
			resPos++;
		}
		if (answer.length == 0) {
			return new String[] {s};
		}
		return Arrays.stream(res).filter(Objects::nonNull).toArray(String[]::new);
	}

}

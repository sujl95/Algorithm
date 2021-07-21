package Algorithm.Java.codingTest._20210320_LINE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _2_New {

	private static boolean[] check = new boolean[5];


	public static void main(String[] args) {
		String str = "AaTa+!12-3";
		String str1 = "aaaaZZZZ)";
		String str2 = "CaCbCgCdC888834A";
		String str3 = "UUUUU";
		String str4 = "ZzZz9Z824";
		System.out.println("solution() = " + Arrays.toString(solution(str4)));
	}

	public static int[] solution(String password) {
		// 1
		if (!(isRange(8, password.length(), 15))) {
			check[0] = true;
		}
		char beforeChar = password.charAt(0);
		int preCount = 1;
		boolean[] ck = new boolean[4];
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (0 < i) {
				if (beforeChar == c) {
					preCount++;
				} else {
					beforeChar = c;
					preCount = 1;
				}
				if (preCount == 4) {
					check[3] = true;
				}
			}
			//2
			if (!isValid(c)) {
				check[1] = true;
			}
			//3
			int value = getConditionValue(c);
			if (value != -1) {
				ck[value] = true;
			}
			//4
			Integer integer = map.get(c);
			if (integer == null) {
				map.put(c, 1);
			} else {
				if (integer == 4) {
					check[4] = true;
				}
				map.put(c, integer + 1);
			}
		}
		threeCondition(ck);
		return getResult();
	}

	private static int[] getResult() {
		String result = "";
		for (int i = 0; i < check.length; i++) {
			if (check[i]) {
				result += i + 1 + " ";
			}
		}
		if (result.length() == 0) {
			return new int[] {0};
		}
		return Arrays.stream(result.split(" ")).mapToInt(Integer::parseInt).toArray();
	}

	private static void threeCondition(boolean[] ck) {
		int ckCount = 0;
		for (boolean b : ck) {
			if (b) {
				ckCount++;
			}
		}
		if (ckCount < 3) {
			check[2] = true;
		}
	}

	private static int getConditionValue(char c) {
		if (isRange('0', c, '9')) {
			return 0;
		}
		if (isRange('A', c, 'Z')) {
			return 1;
		}
		if (isRange('a', c, 'z')) {
			return 2;
		}
		if (isCk(c)) {
			return 3;
		}
		return -1;
	}

	private static boolean isCk(char c) {
		boolean ck = false;
		String reg = "~!@#$%^&*";
		for (int i = 0; i < reg.length(); i++) {
			char ch = reg.charAt(i);
			if (c == ch) {
				ck = true;
				break;
			}
		}
		return ck;
	}

	private static boolean isValid(char c) {
		if (isRange('0', c, '9')) {
			return true;
		}
		if (isRange('A', c, 'Z')) {
			return true;
		}
		if (isRange('a', c, 'z')) {
			return true;
		}
		return isCk(c);
	}

	private static boolean isRange(int c2, int c3, int c4) {
		return c2 <= c3 && c3 <= c4;
	}

}

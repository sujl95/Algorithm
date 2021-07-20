package Algorithm.Java.programmers.level2.kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P67257_2020_Intern {

	private static Map<Character, Integer> map;
	private static long answer = Integer.MIN_VALUE;
	private static List<Character> operands = new ArrayList<>();
	private static List<Long> numbers = new ArrayList<>();
	private static int[][] operArr = {{0, 1, 2}, {0, 2, 1}, {1, 0, 2}, {1, 2, 0}, {2, 0, 1}, {2, 1, 0}};

	public static void main(String[] args) {
		System.out.println("solution(\"100-200*300-500+20\") = " + solution("100-200*300-500+20"));
	}

	public static long solution(String expression) {
		map = new HashMap<>();
		map.put('*', 0);
		map.put('-', 1);
		map.put('+', 2);
		String temp = "";
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (Character.isDigit(c)) {
				temp += c;
			} else {
				operands.add(c);
				numbers.add(Long.valueOf(temp));
				temp = "";
			}
		}
		numbers.add(Long.valueOf(temp));
		Arrays.stream(operArr).forEach(ints -> answer = Math.max(answer, Math.abs(getValue(ints))));
		return answer;
	}

	private static long getValue(int[] oper) {
		List<Long> copyNumbers = new ArrayList<>(numbers);
		List<Character> copyOperands = new ArrayList<>(operands);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < copyOperands.size(); j++) {
				Character c = copyOperands.get(j);
				if (oper[map.get(c)] == i) {
					long num1 = copyNumbers.remove(j);
					long num2 = copyNumbers.remove(j);
					long result = calc(num1, num2, c);
					copyNumbers.add(j, result);
					copyOperands.remove(j);
					j--;
				}
			}
		}
		return copyNumbers.remove(0);
	}

	private static long calc(long num1, long num2, char oper) {
		if (oper == '+') {
			return num1 + num2;
		} else if (oper == '-') {
			return num1 - num2;
		}
		return num1 * num2;
	}
}

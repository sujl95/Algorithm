package Algorithm.Java.programmers.level2.kakao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P67257_2020_Intern_New {


	private static long result = Integer.MIN_VALUE;
	private static char[][] priorities = {{'*', '-', '+'}, {'*', '+', '-'}, {'-', '*', '+'}, {'-', '+', '*'}, {'+', '*', '-'}, {'+', '-', '*'}};
	private static List<Character> operands = new LinkedList<>();
	private static List<Long> numbers = new LinkedList<>();


	public static void main(String[] args) {
		System.out.println("solution(\"100-200*300-500+20\") = " + solution("100-200*300-500+20"));
	}

	public static long solution(String expression) {
		String temp = "";
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (Character.isDigit(c)) {
				temp += c;
			} else {
				numbers.add(Long.valueOf(temp));
				operands.add(c);
				temp = "";
			}

		}
		numbers.add(Long.valueOf(temp));
		Arrays.stream(priorities).forEach(priority -> result = Math.max(result, Math.abs(getValue(priority))));
		return result;
	}

	private static long getValue(char[] priority) {
		List<Long> copyNumbers = new LinkedList<>(numbers);
		List<Character> copyOperands = new LinkedList<>(operands);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < copyOperands.size(); j++) {
				Character c = copyOperands.get(j);
				if (priority[i] == c) {
					Long num1 = copyNumbers.remove(j);
					Long num2 = copyNumbers.remove(j);
					long temp = 0;
					if (c == '+') {
						temp += num1 + num2;
					} else if (c == '-') {
						temp += num1 - num2;
					} else {
						temp += num1 * num2;
					}
					copyNumbers.add(j, temp);
					copyOperands.remove(j);
					j--;
				}
			}
		}
		return copyNumbers.remove(0);
	}

}

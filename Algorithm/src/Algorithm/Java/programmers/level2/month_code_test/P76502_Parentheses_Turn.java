package Algorithm.Java.programmers.level2.month_code_test;

import java.util.Stack;

public class P76502_Parentheses_Turn {

	public static void main(String[] args) {
		System.out.println(solution("[](){}"));
	}

	public static int solution(String s) {
		int answer = 0;
		String copy = s;
		for (int i = 0; i < s.length(); i++) {
			Stack<Character> stack = new Stack<>();
			copy = copy.substring(1) + copy.charAt(0);
			for (int j = 0; j < copy.length(); j++) {
				char c = copy.charAt(j);
				if (stack.isEmpty()) {
					stack.push(c);
					continue;
				}
				char peek = stack.peek();
				if (')' == c) {
					if ('(' == peek) {
						stack.pop();
					}
					continue;
				} else if ('}' == c) {
					if ('{' == peek) {
						stack.pop();
					}
					continue;
				} else if (']' == c) {
					if ('[' == peek) {
						stack.pop();
					}
					continue;
				}
				stack.push(c);
			}
			if (stack.isEmpty()) {
				answer++;
			}
		}
		return answer;
	}

}

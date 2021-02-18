package Algorithm.Java.programmers.level2.practice;

import java.util.Stack;

public class P12909_trueBracket {
	public static void main(String[] args) {
		// String s = "()()";
		// String s = "(())()";
		// String s = ")()(";
		// String s = "(()(";
		String s = "()))((()";
		System.out.println("solution(s) = " + solution(s));
	}

	static boolean solution(String s) {
		if (s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		stack.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				if (stack.peek() == '(') {
					stack.pop();
					continue;
				}
			}
			stack.push(c);
		}
		return stack.isEmpty();
	}
}

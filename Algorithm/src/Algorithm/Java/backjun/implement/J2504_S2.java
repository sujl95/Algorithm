package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class J2504_S2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Stack<String> stack = new Stack<>();
		boolean ck = true;
		for (int i = 0; i < input.length(); i++) {
			String c = String.valueOf(input.charAt(i));
			if ("(".equals(c)) {
				stack.push(")");
				continue;
			}
			if ("[".equals(c)) {
				stack.push("]");
				continue;
			}

			int sum = 0;
			while (true) {
				if (stack.isEmpty()) {
					ck = false;
					break;
				}
				String peek = stack.peek();
				if (!(peek.equals(")") || peek.equals("]"))) {
					sum += Integer.parseInt(stack.pop());
				} else {
					if (c.equals(peek)) {
						stack.pop();
						int num = ")".equals(c) ? 2 : 3;
						if (sum == 0) {
							stack.push(String.valueOf(num));
						} else {
							stack.push(String.valueOf(num * sum));
						}
					} else {
						ck = false;
					}
					break;
				}
			}
			if (!ck) {
				break;
			}
		}
		int res = 0;
		while (!stack.isEmpty()) {
			String peek = stack.peek();
			if (!(peek.equals(")") || peek.equals("]"))) {
				res += Integer.parseInt(stack.pop());
			} else {
				ck = false;
				break;
			}
		}
		if (ck) {
			System.out.println(res);
		} else {
			System.out.println(0);
		}
	}
}

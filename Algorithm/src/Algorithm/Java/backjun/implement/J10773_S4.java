package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class J10773_S4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < K; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input == 0) {
				stack.pop();
			} else {
				stack.push(input);
			}
		}
		int res = stack.stream().mapToInt(i -> i).sum();
		System.out.println(res);
	}

}

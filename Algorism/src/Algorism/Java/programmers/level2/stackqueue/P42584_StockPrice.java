package Algorism.Java.programmers.level2.stackqueue;

import java.util.Arrays;
import java.util.Stack;

public class P42584_StockPrice {

	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		System.out.println(Arrays.toString(solution(prices)));
	}

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < prices.length; i++) {
			while (!stack.isEmpty() && (prices[i] < prices[stack.peek()])) {
				int idx = stack.pop();
				answer[idx] = i - idx;
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			int idx = stack.pop();
			answer[idx] = prices.length - idx - 1;
		}
		return answer;
	}
}

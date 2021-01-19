package Algorism.Java.programmers.level2.stackqueue;

import java.util.Arrays;

public class P42584_StockPrice_For {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		System.out.println(Arrays.toString(solution(prices)));
	}
	public static int[] solution(int[] prices) {
		int len = prices.length;
		int[] answer = new int[len];
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len; j++) {
				answer[i]++;
				if (prices[i] > prices[j]) {
					break;
				}
			}
		}
		return answer;
	}
}

package Algorithm.Java.programmers.level2.month_code_test;

import java.util.Arrays;

public class P77885_two_another_bit_New {

	public static void main(String[] args) {
		// System.out.println("solution() = " + Arrays.toString(solution(new long[] {2, 3, 7, 9})));
		System.out.println("solution() = " + Arrays.toString(solution(new long[] {11})));
	}

	public static long[] solution(long[] numbers) {
		long[] answer = new long[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			long x = 1;
			while ((numbers[i] & x) != 0) {
				x <<= 1;
			}
			if (x != 1) {
				x >>= 1;
			}
			answer[i] = numbers[i] + x;
		}
		return answer;
	}

}

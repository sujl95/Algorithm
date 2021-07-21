package Algorithm.Java.programmers.level2.month_code_test;

import java.util.Arrays;

public class P77885_two_another_bit {

	public static void main(String[] args) {
		// System.out.println("solution() = " + Arrays.toString(solution(new long[] {2, 3, 7, 9})));
		System.out.println("solution() = " + Arrays.toString(solution(new long[] {87})));
	}

	public static long[] solution(long[] numbers) {
		long[] answer = new long[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			long number = numbers[i];
			String binaryString = Long.toBinaryString(number);
			if (number % 2 == 0) {
				answer[i] = numbers[i] + 1;
			} else {
				int lastIndex = binaryString.lastIndexOf("0");
				int index = binaryString.indexOf("1", lastIndex);
				if (lastIndex == -1) {
					binaryString = Long.toBinaryString(++numbers[i]);
					binaryString = binaryString.substring(0, 2) + binaryString.substring(2).replace("0", "1");
				} else {
					binaryString =
							binaryString.substring(0, lastIndex) + "1" + binaryString.substring(lastIndex + 1, index)
									+ "0" + binaryString.substring(index + 1);
				}
				answer[i] = Long.parseLong(binaryString, 2);
			}
		}
		return answer;
	}

}

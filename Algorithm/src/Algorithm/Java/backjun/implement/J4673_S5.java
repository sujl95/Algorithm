package Algorithm.Java.backjun.implement;

import java.util.stream.IntStream;

public class J4673_S5 {

	public static void main(String[] args) {
		boolean[] ck = new boolean[10001];
		IntStream.rangeClosed(1, 10000)
				.map(J4673_S5::selfNum)
				.filter(num -> num < 10001)
				.forEach(num -> ck[num] = true);
		IntStream.rangeClosed(1, 10000)
				.filter(num -> !ck[num])
				.forEach(System.out::println);
	}

	private static int selfNum(int i) {
		int sum = i;
		while(i != 0) {
			sum += i % 10;
			i /= 10;
		}
		return sum;
	}
}

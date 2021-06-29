package Algorithm.Java.backjun.Greedy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class J4673_S5_New {

	public static void main(String[] args) {
		boolean[] ck = new boolean[10001];
		IntStream.rangeClosed(1, 10000)
				.map(J4673_S5_New::selfNum)
				.filter(num -> num < 10001)
				.forEach(num -> ck[num] = true);
		IntStream.rangeClosed(1, 10000)
				.filter(num -> !ck[num])
				.forEach(System.out::println);
	}

	private static int selfNum(int i) {
		return i + Arrays.stream(String.valueOf(i).split(""))
				.mapToInt(Integer::parseInt)
				.sum();
	}
}

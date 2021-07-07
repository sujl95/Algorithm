package Algorithm.Java.codingTest._20210707_ZUM;

import java.util.stream.IntStream;

public class _1 {

	public static void main(String[] args) {
		System.out.println(solution(2));
	}

	public static long solution(long n) {
		return IntStream.iterate(1, i -> i < n, i -> i + 1).mapToLong(i -> (n + 1) * i).sum();
	}

}

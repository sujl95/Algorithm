package Algorithm.Java.programmers.level2.practice;

import java.util.Arrays;

public class P12939_MaxMinNumber {

	public static void main(String[] args) {
		System.out.println(solution("1 2 3 4"));
	}

	public static String solution(String s) {
		int max = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
		int min = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
		return min + " "+ max;
	}
}

package Algorithm.Java.programmers.level2.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class P12951_JadenCase2 {
	public static void main(String[] args) {
		P12951_JadenCase2 sample = new P12951_JadenCase2();
		String s = " A  Sdf Fft ";
		System.out.println("solution() = " + sample.solution(s));
	}

	public String solution(String s) {
		return Arrays.stream(s.split(" "))
				.peek(System.out::println)
				.map(str -> str.toLowerCase().split(""))
				.map(this::makeString)
				.collect(Collectors.joining(" "))
				+ (s.endsWith(" ") ? " " : "");
	}

	public String makeString(String[] strings) {
		StringBuilder answer = new StringBuilder("");
		answer.append(strings[0].toUpperCase());
		for (int i = 1; i < strings.length; i++) {
			answer.append(strings[i]);
		}
		return answer.toString();
	}
}

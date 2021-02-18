package Algorithm.Java.programmers.level2.practice;

public class P12951_JadenCase3 {
	public static void main(String[] args) {
		P12951_JadenCase3 sample = new P12951_JadenCase3();
		String s = " A  Sdf Fft ";
		System.out.println("solution() = " + sample.solution(s));
	}

	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		String[] strings = s.toLowerCase().split("");
		boolean flag = true;
		for (String string : strings) {
			answer.append(flag ? string.toUpperCase() : string);
			flag = string.equals(" ");
		}
		return answer.toString();
	}
}

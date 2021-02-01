package Algorism.Java.programmers.level2.practice;

public class P12951_JadenCase {
	public static void main(String[] args) {
		P12951_JadenCase sample = new P12951_JadenCase();
		String s = " A  Sdf Fft ";
		System.out.println("solution() = " + sample.solution(s));
	}

	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		s = s.toLowerCase();
		boolean ck = true;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ' && !ck) {
				ck = true;
				answer.append(c);
			} else if (c != ' ' && ck){
				ck = false;
				answer.append((c+"").toUpperCase());
			} else {
				answer.append(c);
			}
		}
		return answer.toString();
	}
}

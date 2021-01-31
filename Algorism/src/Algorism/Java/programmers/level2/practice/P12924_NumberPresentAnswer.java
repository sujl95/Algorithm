package Algorism.Java.programmers.level2.practice;

public class P12924_NumberPresentAnswer {
	public static void main(String[] args) {
		System.out.println("solution(15) = " + solution(15));
	}

	public static int solution(int num) {
		int answer = 0;
		for (int i = 1; i <= num; i += 2) {
			if (num % i == 0) {
				answer++;
			}
		}
		return answer;
	}
}

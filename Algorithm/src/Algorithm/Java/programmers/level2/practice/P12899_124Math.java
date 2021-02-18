package Algorithm.Java.programmers.level2.practice;

public class P12899_124Math {
	/**
	 * 1 1
	 * 2 2
	 * 3 4
	 * 4 11
	 * 5 12
	 * 6 14
	 * 7 21
	 * 8 22
	 * 9 24
	 * 10 41
	 */
	public static void main(String[] args) {
		int n = 2;
		System.out.println(solution(n));
	}

	public static String solution(int n) {
		String[] arr = {"1","2","4"};
		String answer = "";
		while (n > 0) {
			answer = arr[(n-1) % 3] + answer;
			n = (n-1) / 3;
		}
		return answer;
	}
}

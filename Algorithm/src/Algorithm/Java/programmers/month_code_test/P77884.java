package Algorithm.Java.programmers.month_code_test;

public class P77884 {

	public static void main(String[] args) {
		System.out.println("solution = " + solution(24, 27));
	}

	private static int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			answer -= Math.sqrt(i) % 1 == 0 ? i : -i;
		}
		return answer;
	}
	
}

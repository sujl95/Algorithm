package Algorithm.Java.programmers.month_code_test;

public class P76501 {

	public static void main(String[] args) {
		int[] absoluts = {4, 7, 12};
		boolean[] signs = {true, false, true};
	}

	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < absolutes.length; i++) {
			int absolute = absolutes[i];
			boolean sign = signs[i];
			if (sign) {
				answer += absolute;
			} else {
				answer -= absolute;
			}
		}
		return answer;
	}

}

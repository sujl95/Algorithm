package Algorithm.Java.programmers.level2.practice;

public class P12945_Fibonacci {

	public static void main(String[] args) {
		System.out.println(solution(5));
	}

	public static int solution(int n) {
		int a0 = 0; // 0
		int a1 = 1; // 1
		for (int i = 1; i <= n; i++) {
			int a2 = (a0 + a1) % 1234567;
			a0 = a1;
			a1 = a2;
		}

		return a0;
	}

}

package Algorithm.Java.codingTest._20210707_ZUM;

public class _1_New {

	public static void main(String[] args) {
		System.out.println(solution(2));
	}

	public static long solution(long n) {
		long ans = 0;
		for (int i = 1; i <= n-1; i++) {
			ans += (n + 1) * i;
		}
		return ans;
	}
}

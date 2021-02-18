package Algorithm.Java.programmers.level2.practice;

public class P12924_NumberPresent {
	public static void main(String[] args) {
		System.out.println("solution(15) = " + solution(15));
	}

	/**
	 * 5 4 3 2 1
	 * 6 5 4
	 * 8 7
	 * 15
	 */
	public static int solution(int n) {
		int answer = 0;
		int divN = (int) Math.ceil((double) n / 2);
		for (int i = divN; i > 0; i--) {
			int sum = i;
			int j = sum-1;
			while (sum <= n) {
				if (sum == n) {
					answer++;
					break;
				}
				if (j == 0) {
					break;
				}
				sum += j--;
			}
		}
		return answer+1;
	}
}

package Algorithm.Java.programmers.level2.practice;

public class P12953_N_LeastCommonMultiple {

	public static void main(String[] args) {
		int[] arr = {2, 6, 8, 14};
		System.out.println("solution() = " + solution(arr));
	}

	public static int solution(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int res = 1;
		for (int j : arr) {
			int gcd = gcd(res, j);
			res = gcd * (res / gcd) * (j / gcd);
		}
		return res;
	}

	public static int gcd(int a , int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}

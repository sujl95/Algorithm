package Algorism.Java.programmers.level2.practice;

import java.util.*;

public class P12936 {

	/**
	 * 1 2 3 4
	 * 1 2 4 3
	 * 1 3 2 4
	 * 1 3 4 2
	 * 1 4 2 3
	 * 1 4 3 2
	 *
	 * 2 1 3 4
	 * 2 1 4 3
	 * 2 3 1 4
	 * 2 3 4 1
	 * 2 4 1 3 (11)
	 * 2 4 3 1
	 *
	 * 1 2 3 4
	 *
	 * 1 3 4
	 *
	 * 1 3
	 *
	 * 11 / 3! = 1      2
	 * k % (n - 1)! = 5
	 *
	 * 5 / 2! = 2   4
	 * 5 % 2! = 1
	 *
	 * 1 / 1 =  1   3
	 * 1 % 1 = 0
	 * 0 / 0 = 0 1
	 *
	 *
	 * k / n =
	 * k % n
	 *
	 *
	 *
	 * 4 / 5
	 *
	 * 4 % 5
	 */

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, 5)));
	}

	public static int[] solution(int n, long k) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(i+1);
		}
		int[] answer = new int[list.size()];
		int idx = 0;
		k--;
		while (n > 1) {
			long f = factorial(--n);
			int i = list.get((int)(k / f));
			answer[idx++] = i;
			list.remove((int)(k / f));
			k %= f;
		}
		answer[idx] = list.get(0);
		return answer;
	}


	public static long factorial(int n) {
		long answer = 1;
		for (int i = n; i >= 1; i--) {
			answer *= i;
		}
		return answer;
	}
}

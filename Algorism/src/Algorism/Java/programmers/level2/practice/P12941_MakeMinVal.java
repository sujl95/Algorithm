package Algorism.Java.programmers.level2.practice;

import java.util.Arrays;

public class P12941_MakeMinVal {
	public static void main(String[] args) {

	}

	public int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[B.length - 1 - i];
		}

		return answer;
	}
}

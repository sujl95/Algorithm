package Algorithm.Java.codingTest._20210523_IPortFolio;

import java.util.Arrays;

public class _1 {



	public static void main(String[] args) {
		System.out.println("solution(15) = " + solution(15));
	}

	public static int solution(int n) {
		boolean[] arr = new boolean[n+1];
		int answer = 0;
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = true;
			}
			if (i % 3 == 0) {
				arr[i] = !arr[i];
			}
			if (!arr[i]) {
				answer++;
			}
		}

		System.out.println("arr = " + Arrays.toString(arr));
		return answer;
	}


}

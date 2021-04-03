package Algorithm.Java.codingTest._20210403_KakaoCommerce;

import java.util.Arrays;

public class _2 {
	static boolean[] visited;
	static int[] arr;
	static int[] resArr;
	static int[][] needs;
	static int r;

	public static void main(String[] args) {
		int[][] needs = {
				{1, 0, 0},
				{1, 1, 0},
				{1, 1, 0},
				{1, 0, 1},
				{1, 1, 0},
				{0, 1, 1}
		};
		int r = 2;
		System.out.println(new _2().solution(needs, r));
	}

	public int solution(int[][] needs, int r) {
		int answer = 0;
		visited = new boolean[r + 1];
		this.needs = needs;
		arr = new int[needs[0].length];
		this.r = r;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
		combination(arr, visited, 0, arr.length, r);
		return answer;
	}

	private static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
		if(r == 0) {
			resArr = Arrays.stream(result(arr, visited, n).trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			combinationResult(resArr);
			return;
		}

		for (int i = start; i < n; i++) {
			visited[i] = true;
			combination(arr, visited, i + 1, n, r - 1);
			visited[i] = false;
		}
	}

	private static String result(int[] arr, boolean[] visited, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				result += arr[i] + " ";
			}
		}
		return result;
	}

	private static void combinationResult(int[] resArr) {
		int count = 0;
		int resCount = 0;
		for (int k = 0; k < resArr.length; k++) {
			for (int i = 0; i< needs.length; i++) {
				for (int j = 0; j < needs[0].length; j++) {
					if (needs[i][j] == resArr[k]) {
						count++;
						break;
					}
				}
				System.out.println("count = " + count);
			}
			count = 0;
			if (count == r) {
				resCount++;
			}
		}
		System.out.println("resCount = " + resCount);
	}
}

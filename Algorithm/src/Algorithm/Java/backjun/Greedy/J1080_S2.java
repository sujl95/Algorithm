package Algorithm.Java.backjun.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J1080_S2 {

	static int N;
	static int M;
	static int[][] arr;
	static int[][] target;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = input[0];
		M = input[1];
		arr = new int[N][];
		target = new int[N][];
		for (int i = 0; i < N; i++) {
			arr[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
		}

		for (int i = 0; i < N; i++) {
			target[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
		}
		int res = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (arr[i][j] != target[i][j]) {
					if (isOk(i, j)) {
						res++;
					} else {
						System.out.println("-1");
						return;
					}
				}
			}
		}
		System.out.println(res);
	}

	private static boolean isOk(int x, int y) {
		if (N < x + 3 || M < y + 3) {
			return false;
		}
		for (int i = x; i < x + 3; i++) {
			for (int j = y; j < y + 3; j++) {
				arr[i][j] = 1 - arr[i][j];
			}
		}
		return true;
	}
}

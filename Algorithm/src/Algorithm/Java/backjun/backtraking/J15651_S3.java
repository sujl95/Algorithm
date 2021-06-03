package Algorithm.Java.backjun.backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J15651_S3 {

	static int[] arr;

	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = input[0];
		M = input[1];
		arr = new int[M];
		dfs(0);
		System.out.println(sb);
	}

	private static void dfs(int depth) {
		if (M == depth) {
			for (int value : arr) {
				sb.append(value).append(' ');
			}
			sb.append('\n');
			return;
		}
		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}
}

package Algorithm.Java.backjun.backtraking;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J15650_S3 {

	static int[] arr;
	static boolean[] visited;
	static int N;
	static int M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		N = input[0];
		M = input[1];

		arr = new int[M];
		visited = new boolean[N];

		dfs(1, 0);
	}

	private static void dfs(int pos, int depth) {
		if (M == depth) {
			for (int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
			return;
		}
		for (int i = pos; i <= N; i++) {
			arr[depth] = i;
			dfs(i + 1, depth + 1);
		}
	}
}


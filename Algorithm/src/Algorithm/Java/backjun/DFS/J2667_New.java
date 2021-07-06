package Algorithm.Java.backjun.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class J2667_New {

	private static int N;
	private static int[][] arr;
	private static int[][] xy = new int[][] {{0, 1, 0, -1}, {1, 0, -1, 0}};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N][];
		IntStream.range(0, N)
				.forEach(i -> arr[i] = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray());

		List<Integer> answers = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 1) {
					int dfs = dfs(i, j);
					answers.add(dfs);
				}
			}
		}
		answers.sort(null);
		long count = answers.stream().filter(i -> i != 0).count();
		System.out.println(count);
		answers.stream().filter(i -> i != 0).forEach(System.out::println);
	}

	private static int dfs(int x, int y) {
		arr[x][y] = 0;
		int cnt = 1;
		for (int i = 0; i < 4; i++) {
			int nextX = xy[0][i] + x;
			int nextY = xy[1][i] + y;
			if (isAvailable(nextX, nextY)) {
				if (arr[nextX][nextY] == 1) {
					cnt += dfs(nextX, nextY);
				}
			}
		}
		return cnt;
	}

	private static boolean isAvailable(int nextX, int nextY) {
		return nextX >= 0 && nextX < N && nextY >= 0 && nextY < N;
	}

}

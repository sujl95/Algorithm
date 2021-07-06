package Algorithm.Java.backjun.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J4963_S2 {

	private static int[] dx = {0, 0, -1, 1, 1, -1, -1, 1};
	private static int[] dy = {-1, 1, 0, 0, 1, 1, -1, -1};
	private static int N;
	private static int M;
	private static int[][] map;
	private static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			N = input[0];
			M = input[1];
			if (N == 0 && M == 0) {
				break;
			}
			map = new int[M][N];
			visited = new boolean[M][N];
			int cnt = 0;
			for (int i = 0; i < M; i++) {
				map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			}
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j] && map[i][j] == 1) {
						dfs(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

	private static void dfs(int x, int y) {
		visited[x][y] = true;
		for (int k = 0; k < 8; k++) {
			int nextX = x + dx[k];
			int nextY = y + dy[k];
			if (0 <= nextX && nextX < M && 0 <= nextY && nextY < N && map[nextX][nextY] == 1
					&& !visited[nextX][nextY]) {
				dfs(nextX, nextY);
			}
		}
	}
}

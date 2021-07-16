package Algorithm.Java.backjun.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class J4963_S2_New {

	private static class Position {
		public int x;
		public int y;

		public Position(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private static int N;
	private static int M;
	private static int[][] map;
	private static boolean[][] visited;
	private static final int[] dx = {0, 0, -1, 1, 1, -1, -1, 1};
	private static final int[] dy = {-1, 1, 0, 0, 1, 1, -1, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			N = input[0];
			M = input[1];
			if (N == 0 && M == 0) {
				break;
			}
			int res = 0;
			map = new int[M][N];
			visited = new boolean[M][N];
			for (int i = 0; i < M; i++) {
				map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			}
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 1 && !visited[i][j]) {
						bfs(i, j);
						res++;
					}
				}
			}
			System.out.println(res);
		}
	}

	private static void bfs(int x, int y) {
		Queue<Position> queue = new ArrayDeque<>();
		queue.offer(new Position(x, y));
		while (!queue.isEmpty()) {
			Position now = queue.poll();
			for (int i = 0; i < 8; i++) {
				int nextX = now.x + dx[i];
				int nextY = now.y + dy[i];
				if (0 <= nextX && nextX < M && 0 <= nextY && nextY < N && map[nextX][nextY] == 1
						&& !visited[nextX][nextY]) {
					visited[now.x][now.y] = true;
					visited[nextX][nextY] = true;
					queue.offer(new Position(nextX, nextY));
				}
			}
		}
	}
}

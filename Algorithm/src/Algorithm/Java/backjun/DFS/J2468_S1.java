package Algorithm.Java.backjun.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class J2468_S1 {

	private static class Position {
		public int x;
		public int y;

		public Position(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private static int N;
	private static boolean[][] visited;
	private static final int[] dx = {0, 0, 1, -1};
	private static final int[] dy = {1, -1, 0, 0};
	private static int res;
	private static final List<Integer> heights = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int[][] map = new int[N][N];
		for (int i = 0; i < N; i++) {
			map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for (int j = 0; j < N; j++) {
				if (!heights.contains(map[i][j])) {
					heights.add(map[i][j]);
				}
			}
		}
		heights.add(0);
		Collections.sort(heights);
		for (int height : heights) {
			visited = new boolean[N][N];
			int count = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] <= height) {
						visited[i][j] = true;
					}
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j]) {
						bfs(i, j);
						count++;
					}
				}
			}
			res = Math.max(res, count);
		}
		System.out.println(res);
	}

	private static void bfs(int x, int y) {
		Queue<Position> queue = new ArrayDeque<>();
		queue.offer(new Position(x, y));
		while (!queue.isEmpty()) {
			Position now = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if (0 <= nx && nx < N && 0 <= ny && ny < N && !visited[nx][ny]) {
					visited[nx][ny] = true;
					queue.offer(new Position(nx, ny));
				}
			}
		}
	}
}
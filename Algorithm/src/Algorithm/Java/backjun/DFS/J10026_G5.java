package Algorithm.Java.backjun.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class J10026_G5 {

	private static class Position {
		public int x;
		public int y;

		public Position(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private static final int[] dx = {0, 0, 1, -1};
	private static final int[] dy = {1, -1, 0, 0};
	private static int N;
	private static boolean[][] visited;
	private static String[][] map;
	private static int res = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		visited = new boolean[N][N];
		map = new String[N][N];
		for (int i = 0; i < N; i++) {
			map[i] = Arrays.stream(br.readLine().split("")).toArray(String[]::new);
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					bfs(i, j);
					res++;
				}
			}
		}
		System.out.print(res + " ");
		res = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j].equals("G")) {
					map[i][j] = "R";
				}
			}
		}
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					bfs(i, j);
					res++;
				}
			}
		}
		System.out.print(res);
	}

	private static void bfs(int x, int y) {
		Queue<Position> queue = new ArrayDeque<>();
		queue.offer(new Position(x, y));
		String color = map[x][y];
		while (!queue.isEmpty()) {
			Position now = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if (0 <= nx && nx < N && 0 <= ny && ny < N && !visited[nx][ny] && map[nx][ny].equals(color)) {
					visited[nx][ny] = true;
					queue.offer(new Position(nx, ny));
				}
			}
		}
	}
}
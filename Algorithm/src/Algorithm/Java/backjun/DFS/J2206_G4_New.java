package Algorithm.Java.backjun.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class J2206_G4_New {

	private static class Position {
		public int x;
		public int y;
		public int count;
		public int wallBreak;

		public Position(int x, int y, int count, int wallBreak) {
			this.x = x;
			this.y = y;
			this.count = count;
			this.wallBreak = wallBreak;
		}
	}

	private static int N;
	private static int M;
	private static int[][] map;
	private static boolean[][][] visited;
	private static int[] dx = {0, 0, 1, -1};
	private static int[] dy = {1, -1, 0, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = input[0];
		M = input[1];
		map = new int[N][M];
		visited = new boolean[N][M][2];
		for (int i = 0; i < N; i++) {
			map[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
		}
		bfs();
	}

	private static void bfs() {
		Queue<Position> queue = new ArrayDeque<>();
		queue.offer(new Position(0, 0, 1, 0));
		visited[0][0][0] = true;
		visited[0][0][1] = true;
		while (!queue.isEmpty()) {
			Position now = queue.poll();
			if (now.x == N - 1 && now.y == M - 1) {
				System.out.println(now.count);
				return;
			}
			for (int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if (0 <= nx && nx < N && 0 <= ny && ny < M) {
					if (map[nx][ny] == 1) {
						if (now.wallBreak == 0 && !visited[nx][ny][1]) {
							visited[nx][ny][1] = true;
							queue.offer(new Position(nx, ny, now.count + 1, 1));
						}
					} else {
						if (!visited[nx][ny][now.wallBreak]) {
							queue.offer(new Position(nx, ny, now.count + 1, now.wallBreak));
							visited[nx][ny][now.wallBreak] = true;
						}
					}
				}
			}
		}
		System.out.println(-1);
	}
}

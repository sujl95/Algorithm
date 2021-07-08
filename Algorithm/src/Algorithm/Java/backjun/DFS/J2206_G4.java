package Algorithm.Java.backjun.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class J2206_G4 {

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
	private static int[][] visited;
	private static int[] dx = {0, 0, 1, -1};
	private static int[] dy = {1, -1, 0, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = input[0];
		M = input[1];
		map = new int[N][M];
		visited = new int[N][M];
		for (int i = 0; i < N; i++) {
			map[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
			Arrays.fill(visited[i], Integer.MAX_VALUE);
		}
		System.out.println(bfs());
	}

	private static int bfs() {
		visited[0][0] = 0;
		Queue<Position> queue = new ArrayDeque<>();
		queue.offer(new Position(0, 0, 1, 0));
		while (!queue.isEmpty()) {
			Position now = queue.poll();
			if (now.x == M - 1 && now.y == N - 1) {
				return now.count;
			}
			for (int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
					if (visited[ny][nx] > now.wallBreak) {
						if (map[ny][nx] == 0){
							queue.offer(new Position(nx, ny, now.count + 1, now.wallBreak));
							visited[ny][nx] = now.wallBreak;
						} else {
							if (now.wallBreak == 0) {
								queue.offer(new Position(nx, ny, now.count + 1, now.wallBreak + 1));
								visited[ny][nx] = now.wallBreak + 1;
							}
						}
					}
				}
			}
		}
		return -1;
	}
}

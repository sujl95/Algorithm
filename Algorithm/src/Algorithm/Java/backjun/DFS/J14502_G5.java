package Algorithm.Java.backjun.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.stream.IntStream;

public class J14502_G5 {

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
	private static int res;
	private static int[][] wall;
	private static int[] dx = {-1, 1, 0, 0};
	private static int[] dy = {0, 0, 1, -1};
	private static Queue<Position> virusPositions = new ArrayDeque<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = input[0];
		M = input[1];
		wall = new int[N][M];
		for (int i = 0; i < N; i++) {
			wall[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for (int j = 0; j < M; j++) {
				if (wall[i][j] == 2) {
					virusPositions.offer(new Position(i, j));
				}
			}
		}
		dfs(0);
		System.out.println(res);
	}

	private static void dfs(int wallCount) {
		if (wallCount == 3) {
			bfs();
			return;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (wall[i][j] == 0) {
					wall[i][j] = 1;
					dfs(wallCount + 1);
					wall[i][j] = 0;
				}
			}
		}
	}

	private static void bfs() {
		int[][] copyVirusWall = new int[N][M];
		IntStream.range(0, N)
				.filter(i -> M >= 0)
				.forEach(i -> System.arraycopy(wall[i], 0, copyVirusWall[i], 0, M));
		Queue<Position> queue = new ArrayDeque<>(virusPositions);

		while (!queue.isEmpty()) {
			Position now = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = now.x + dx[i];
				int nextY = now.y + dy[i];
				if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M && copyVirusWall[nextX][nextY] == 0) {
					copyVirusWall[nextX][nextY] = 2;
					queue.offer(new Position(nextX, nextY));
				}
			}
		}
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (copyVirusWall[i][j] == 0) {
					count++;
				}
			}
		}
		res = Math.max(count, res);
	}
}


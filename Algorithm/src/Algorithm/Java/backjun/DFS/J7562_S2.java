package Algorithm.Java.backjun.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class J7562_S2 {

	private static int[][] map;

	private static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
	private static int[] dy = {2, 1, -1, -2, 2, 1, -1, -2};
	private static boolean[][] visited;
	private static int x1;
	private static int y1;
	private static int x2;
	private static int y2;
	private static int I;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			I = Integer.parseInt(br.readLine());
			map = new int[I][I];
			visited = new boolean[I][I];
			int[] nowPosition = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] target = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			x1 = nowPosition[0];
			y1 = nowPosition[1];
			x2 = target[0];
			y2 = target[1];
			bfs(x1, y1);
			System.out.println(map[x2][y2]);
		}
	}

	private static void bfs(int x, int y) {
		if (x == x2 && y == y2) {
			return;
		}
		Queue<Position> queue = new ArrayDeque<>();
		visited[x][y] = true;
		queue.offer(new Position(x, y));
		while (!queue.isEmpty()) {
			Position now = queue.poll();
			for (int i = 0; i < 8; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if (0 <= nx && nx < I && 0 <= ny && ny < I && !visited[nx][ny]) {
					queue.offer(new Position(nx, ny));
					visited[nx][ny] = true;
					map[nx][ny] = map[now.x][now.y] + 1;
				}
			}
		}
	}
}

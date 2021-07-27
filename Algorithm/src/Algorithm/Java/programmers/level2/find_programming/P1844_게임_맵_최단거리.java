package Algorithm.Java.programmers.level2.find_programming;

import java.util.ArrayDeque;
import java.util.Queue;

public class P1844_게임_맵_최단거리 {

	private static class Position {
		int x;
		int y;
		int count;

		public Position(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}

	}

	private static boolean[][] visited;
	private static int[] dx = {0, 0, 1, -1};
	private static int[] dy = {1, -1, 0, 0};
	private static int n;
	private static int m;


	public static void main(String[] args) {
		int[][] map = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
		System.out.println("solution() = " + solution(map));
	}

	public static int solution(int[][] maps) {
		n = maps.length;
		m = maps[0].length;
		visited = new boolean[n][m];
		return bfs(maps);
	}

	private static int bfs(int[][] maps) {
		Queue<Position> queue = new ArrayDeque<>();
		queue.offer(new Position(0, 0, 1));
		visited[0][0] = true;
		while (!queue.isEmpty()) {
			Position now = queue.poll();
			int col = now.x;
			int row = now.y;
			if (col == n - 1 && row == m - 1) {
				return now.count;
			}
			for (int i = 0; i < 4; i++) {
				int endCol = col + dx[i];
				int endRow = row + dy[i];
				if (0 <= endCol && endCol < n && 0 <= endRow && endRow < m && !visited[endCol][endRow]
						&& maps[endCol][endRow] == 1) {
					queue.offer(new Position(endCol, endRow, now.count + 1));
					visited[endCol][endRow] = true;
				}
			}
		}
		return -1;
	}
}

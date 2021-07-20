package Algorithm.Java.backjun.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class J2178_New3_S1 {

	private static int[][] map;
	private static boolean[][] visited;
	private static int[] dx = {0, 1, 0, -1};
	private static int[] dy = {1, 0, -1, 0};
	private static int n;
	private static int m;


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);

		map = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String[] input2 = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(input2[j]);
			}
		}
		bfs(0, 0);
	}

	private static void bfs(int x, int y) {
		Queue<Index> queue = new ArrayDeque<>();
		queue.offer(new Index(x, y, 1));
		while (!queue.isEmpty()) {
			Index index = queue.poll();

			if (index.x == n - 1 && index.y == m - 1) {
				System.out.println(index.count);
				break;
			}

			for (int i = 0; i < 4; i++) {
				int nextX = index.x + dx[i];
				int nextY = index.y + dy[i];
				if (isAvail(nextX, nextY)) {
					continue;
				}
				visited[nextX][nextY] = true;
				queue.offer(new Index(nextX, nextY, index.count + 1));
			}
		}
	}

	public static boolean isAvail(int nextX, int nextY) {
		return nextX < 0 || nextY < 0 || nextX >= n || nextY >= m || map[nextX][nextY] == 0 || visited[nextX][nextY];
	}
}

class Index {
	public int x;
	public int y;
	public int count;

	public Index(int x, int y, int count) {
		this.x = x;
		this.y = y;
		this.count = count;
	}
}


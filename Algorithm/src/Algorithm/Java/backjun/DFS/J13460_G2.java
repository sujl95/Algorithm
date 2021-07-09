package Algorithm.Java.backjun.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class J13460_G2 {

	private static class Position {
		public int rx;
		public int ry;
		public int bx;
		public int by;
		public int count;

		public Position() {

		}
		public Position(int rx, int ry, int bx, int by, int count) {
			this.rx = rx;
			this.ry = ry;
			this.bx = bx;
			this.by = by;
			this.count = count;
		}

	}

	private static String[][] map;
	private static boolean[][][][] visited;
	public static int[] dx = {0, 0, 1, -1};
	public static int[] dy = {1, -1, 0, 0};


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = input[0];
		int M = input[1];
		map = new String[N][M];
		visited = new boolean[N][M][N][M];
		Position init = new Position();
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				String s = map[i][j];
				if (s.equals("R")) {
					init.rx = i;
					init.ry = j;
				} else if (s.equals("B")) {
					init.bx = i;
					init.by = j;
				}
			}
		}
		bfs(init);
	}

	private static void bfs(Position init) {
		Queue<Position> queue = new ArrayDeque<>();
		queue.offer(init);

		while (!queue.isEmpty()) {
			Position now = queue.poll();
			int nowBx = now.bx;
			int nowBy = now.by;
			int nowRx = now.rx;
			int nowRy = now.ry;
			visited[nowRx][nowRy][nowBx][nowBy] = true;
			if (now.count > 9) {
				System.out.println(-1);
				return;
			}

			for (int i = 0; i < 4; i++) {
				int nbx = nowBx;
				int nby = nowBy;
				while (!map[nbx + dx[i]][nby + dy[i]].equals("#")) {
					nbx += dx[i];
					nby += dy[i];
					if (map[nbx][nby].equals("O")) {
						break;
					}
				}

				int nrx = nowRx;
				int nry = nowRy;
				while (!map[nrx + dx[i]][nry + dy[i]].equals("#")) {
					nrx += dx[i];
					nry += dy[i];
					if (map[nrx][nry].equals("O")) {
						break;
					}
				}
				if (map[nbx][nby].equals("O")) {
					continue;
				}
				if (map[nrx][nry].equals("O")) {
					System.out.println(now.count + 1);
					return;
				}

				if (nrx == nbx && nry == nby) {
					switch (i) {
						case 0:
							if (nowRy > nowBy) {
								nby -= 1;
							} else {
								nry -= 1;
							}
							break;
						case 1:
							if (nowRy > nowBy) {
								nry += 1;
							} else {
								nby += 1;
							}
							break;
						case 2:
							if (nowRx > nowBx) {
								nbx -= 1;
							} else {
								nrx -= 1;
							}
							break;
						case 3:
							if (nowRx > nowBx) {
								nrx += 1;
							} else {
								nbx += 1;
							}
							break;
					}
				}
				if (!visited[nrx][nry][nbx][nby]) {
					queue.offer(new Position(nrx, nry, nbx, nby, now.count + 1));
				}
			}
		}
		System.out.println(-1);
	}
}

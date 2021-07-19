package Algorithm.Java.backjun.dfs;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class J16236_G4 {

	private static class Position {
		private int x;
		private int y;

		private Position(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private static int[] dx = {1, 0, -1, 0};
	private static int[] dy = {0, 1, 0, -1};
	private static int N;
	private static int[][] map;
	private static int[][] dist;
	private static int sharkSize = 2;
	private static int eatingCount;
	private static int count;
	private static int sharkX ;
	private static int sharkY ;
	private static int minX;
	private static int minY;
	private static int minDist;



	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		map = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] = scanner.nextInt();

				if (map[i][j] == 9) {
					sharkX = i;
					sharkY = j;
					map[i][j] = 0;
				}
			}
		}

		while (true) {
			dist = new int[N + 1][N + 1];
			minX = Integer.MAX_VALUE;
			minY = Integer.MAX_VALUE;
			minDist = Integer.MAX_VALUE;

			bfs(sharkX, sharkY);

			if (minX != Integer.MAX_VALUE && minY != Integer.MAX_VALUE) {
				eatingCount++;
				map[minX][minY] = 0;
				sharkX = minX;
				sharkY = minY;
				count += dist[minX][minY];

				if (eatingCount == sharkSize) {
					sharkSize++;
					eatingCount = 0;
				}
			} else {
				break;
			}
		}

		System.out.println(count);
	}

	private static void bfs(int x, int y) {
		Queue<Position> queue = new ArrayDeque<>();
		queue.add(new Position(x, y));

		while (!queue.isEmpty()) {
			Position now = queue.poll();
			for (int i = 0; i < 4; i++) {
				int newX = now.x + dx[i];
				int newY = now.y + dy[i];

				if (isInArea(newX, newY) && isAbleToMove(newX, newY) && dist[newX][newY] == 0) {
					dist[newX][newY] = dist[now.x][now.y] + 1;

					if (isEatable(newX, newY)) {
						if (minDist > dist[newX][newY]) {
							minDist = dist[newX][newY];
							minX = newX;
							minY = newY;
						} else if (minDist == dist[newX][newY]) {
							if (minX == newX) {
								if (minY > newY) {
									minX = newX;
									minY = newY;
								}
							} else if (minX > newX) {
								minX = newX;
								minY = newY;
							}
						}
					}
					queue.add(new Position(newX, newY));
				}
			}
		}
	}

	private static boolean isAbleToMove(int x, int y) {
		return map[x][y] <= sharkSize;
	}

	private static boolean isEatable(int x, int y) {
		return map[x][y] != 0 && map[x][y] < sharkSize;
	}

	private static boolean isInArea(int x, int y) {
		return 0 < x && x <= N && 0 < y && y <= N;
	}
}

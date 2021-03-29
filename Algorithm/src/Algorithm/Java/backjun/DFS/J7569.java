package Algorithm.Java.backjun.DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J7569 {

	static int[] dx = { -1, 0, 1, 0, 0, 0 };
	static int[] dy = { 0, 1, 0, -1, 0, 0 };
	static int[] dz = { 0, 0, 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[][][] arr = new int[h][n][m];
		int[][][] distance = new int[h][n][m];
		Queue<Coordinate> queue = new LinkedList<>();
		for (int k = 0; k < h; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[k][i][j] = sc.nextInt();
					if (arr[k][i][j] == 1) {
						queue.offer(new Coordinate(k, i, j));
					}
				}
			}
		}
		while (!queue.isEmpty()) {
			Coordinate coordinate = queue.poll();
			int x = coordinate.x;
			int y = coordinate.y;
			int z = coordinate.z;
			for (int i = 0; i < dx.length; i++) {
				int nextX = x + dx[i];
				int nextY = y + dy[i];
				int nextZ = z + dz[i];

				if (0 <= nextX && 0 <= nextY && 0 <= nextZ && nextX < h && nextY < n && nextZ < m) {
					if (arr[nextX][nextY][nextZ] == 0 && distance[nextX][nextY][nextZ] == 0) {
						queue.offer(new Coordinate(nextX, nextY, nextZ));
						distance[nextX][nextY][nextZ] = distance[x][y][z] + 1;
					}
				}
			}
		}

		int answer = 0;
		for (int k = 0; k < h; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (answer < distance[k][i][j]) {
						answer = distance[k][i][j];
					}
				}
			}
		}
		for (int k = 0; k < h; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (arr[k][i][j] == 0 && distance[k][i][j] == 0) {
						answer = -1;
						break;
					}
				}
			}
		}
		System.out.println(answer);
	}

}

class Coordinate {
	int x;
	int y;
	int z;

	public Coordinate(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "Coordinate{" +
				"x=" + x +
				", y=" + y +
				", z=" + z +
				'}';
	}
}

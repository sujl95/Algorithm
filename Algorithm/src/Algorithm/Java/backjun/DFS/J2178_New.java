package Algorithm.Java.backjun.DFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J2178_New {

	static int[][] arr;
	static boolean[][] visited;
	static int[][] xy = {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static int N, M;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N][];
		visited = new boolean[N][M];
		for (int i = 0; i< N; i++) {
			arr[i] = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
		}
		bfs(0, 0);
		System.out.println(arr[N - 1][M - 1]);
	}

	private static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {x, y});

		while(!queue.isEmpty()) {
			int[] location = queue.poll();
			visited[x][y] = true;
			for (int i = 0; i < 4; i++) {
				int nextX = location[0] + xy[0][i];
				int nextY = location[1] + xy[1][i];

				if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < M) {
					if (arr[nextX][nextY] != 0 && !visited[nextX][nextY]) {
						queue.offer(new int[] {nextX, nextY});
						visited[nextX][nextY] = true;
						arr[nextX][nextY] = arr[location[0]][location[1]] + 1;
					}
				}
			}
		}
	}

}

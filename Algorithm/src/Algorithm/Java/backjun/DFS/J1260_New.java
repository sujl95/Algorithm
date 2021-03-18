package Algorithm.Java.backjun.DFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class J1260_New {

	static int[][] arr;
	static int[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();

		arr = new int[N + 1][N + 1];
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		for (int[] ints : arr) {
			System.out.println(Arrays.toString(ints));
		}
		visited = new int[N + 1];
		dfs(V);
		System.out.println();
		visited = new int[N + 1];
		bfs(V);
	}

	private static void bfs(int v) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited[v] = 1;
		while (!queue.isEmpty()) {
			int n = queue.poll();
			System.out.print(n + " ");
			// IntStream.range(1, arr.length).filter(i -> arr[n][i] == 1 && visited[i] == 0).forEach(i -> {
			// 	queue.add(i);
			// 	visited[i] = 1;
			// });
			for (int i = 1; i < arr.length; i++) {
				if (arr[n][i] == 1 && visited[i] == 0) {
					queue.add(i);
					visited[i] = 1;
				}
			}
		}
	}

	private static void dfs(int v) {
		visited[v] = 1;
		System.out.print(v + " ");
		// IntStream.range(1, arr.length).filter(i -> arr[v][i] == 1 && visited[i] == 0).forEach(J1260_New::dfs);
		for (int i = 1; i < arr.length; i++) {
			if (arr[v][i] == 1 && visited[i] == 0) {
				dfs(i);
			}
		}
	}

}

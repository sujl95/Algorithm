package Algorithm.Java.backjun.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class J2583_S1 {

	private static int M;
	private static int N;
	private static int K;
	private static int[] dx = {0, 0, 0, 1, -1};
	private static int[] dy = {0, 1, -1, 0, 0};
	private static int[][] arr;
	private static boolean[][] visited;
	private static List<Integer> answers = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		M = input[0];
		N = input[1];
		K = input[2];
		arr = new int[M][N];
		visited = new boolean[M][N];
		for (int i = 0; i < K; i++) {
			int[] xy = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int x1 = xy[0];
			int y1 = xy[1];
			int x2 = xy[2];
			int y2 = xy[3];
			for (int x = x1; x < x2; x++) {
				for (int y = y1; y < y2; y++) {
					arr[y][x] = 1;
					visited[y][x] = true;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					bfs(i, j);
					count++;
				}
			}
		}
		System.out.println(count);
		answers.stream().sorted().mapToInt(i -> i).forEach(i -> System.out.print(i + " "));

	}

	private static void bfs(int x, int y) {
		Queue<Position> queue = new ArrayDeque<>();
		queue.offer(new Position(x, y));
		int count = 0;
		while (!queue.isEmpty()) {
			Position now = queue.poll();
			for (int i = 0; i < 5; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if (0 <= nx && nx < M && 0 <= ny && ny < N && !visited[nx][ny]) {
					visited[nx][ny] = true;
					queue.offer(new Position(nx, ny));
					count++;
				}
			}
		}
		answers.add(count);
	}
}

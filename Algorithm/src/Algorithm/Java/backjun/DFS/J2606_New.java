package Algorithm.Java.backjun.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class J2606_New {

	static int cnt;
	static int[][] arr;
	static boolean[] visited;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		arr = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		dfs(1);
		Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
		System.out.println(cnt);
	}

	private static void dfs(int v) {
		visited[v] = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[v][i] == 1 && !visited[i]) {
				dfs(i);
				cnt++;
			}
		}
	}
}

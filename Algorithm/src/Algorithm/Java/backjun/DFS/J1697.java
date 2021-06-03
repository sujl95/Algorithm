package Algorithm.Java.backjun.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J1697 {
	static int n;
	static int k;
	static int[] visited = new int[100001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();

		if (n == k) {
			System.out.println(0);
			return;
		}
		bfs(n);

	}

	private static void bfs(int n) {
		Queue<Integer> q = new LinkedList<>();
		visited[n] = 1;
		q.offer(n);
		while (!q.isEmpty()) {
			int value = q.poll();
			for (int i = 0; i < 3; i++) {
				int nextValue;
				if (i == 0) {
					nextValue = value + 1;
				} else if (i == 1) {
					nextValue = value - 1;
				} else {
					nextValue = value * 2;
				}
				if (nextValue == k) {
					System.out.println(visited[value]);
					return;
				}
				if (0 <= nextValue && nextValue < visited.length && visited[nextValue] == 0) {
					q.offer(nextValue);
					visited[nextValue] = visited[value] + 1;
				}
			}
		}
	}
}

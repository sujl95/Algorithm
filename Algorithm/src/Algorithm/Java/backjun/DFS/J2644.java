package Algorithm.Java.backjun.DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J2644 {

	static int n;
	static int m;
	static int[][] arr;
	static int[] distance;
	static boolean[] isVisited;
	static int people1;
	static int people2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		isVisited = new boolean[n + 1];
		distance = new int[n + 1];
		people1 = sc.nextInt();
		people2 = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		bfs(people1,people2);
		if (distance[people2] == 0) {
			System.out.println(-1);
		} else {
			System.out.println(distance[people2]);
		}
	}

	private static void bfs(int start, int end) {
		Queue<Integer> queue = new LinkedList<>();
		isVisited[start] = true;
		queue.offer(start);
		while (!queue.isEmpty()) {
			int value = queue.poll();
			if (value == end) {
				break;
			}
			for (int i = 1; i < arr.length; i++) {
				if (arr[value][i] == 1 && !isVisited[i]) {
					queue.offer(i);
					isVisited[i] = true;
					distance[i] = distance[value] + 1;
				}
			}
		}
	}
}

package Algorithm.Java.backjun.dfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class J1260_New2_S2 {

	static List<Integer>[] arr;
	static boolean[] visited;
	static int n ;
	static int m ;
	static int start;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 받아
		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();

		arr = new ArrayList[n + 1];
		for (int i = 0; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}

		// 넣을게
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x].add(y);
			arr[y].add(x);
		}

		for (List<Integer> integers : arr) {
			Collections.sort(integers);
		}

		visited = new boolean[1_001];
		dfs(start);
		System.out.println();
		visited = new boolean[1_001];
		bfs();

	}

	private static void dfs(int start) {
		visited[start] = true;
		System.out.print(start + " ");
		for (int i = 0; i < arr[start].size(); i++) {
			int now = arr[start].get(i);
			if (!visited[now]) {
				visited[now] = true;
				dfs(now);
			}
		}
	}

	// bfs Queue
	private static void bfs() {
		// Queue 선언해주고
		Queue<Integer> q = new ArrayDeque<>();
		// 첫 번째 넣고
		q.offer(start);
		// 체킹해주고
		visited[start] = true;

		//q에 비어있지 않아야하니까?
		while(!q.isEmpty()) {
			// 담겨있는거 빼고
			int now = q.poll();
			System.out.print(now + " ");

			// now 와 연결되어있는 노드를 찾아야한다. 이전에 탐색 안한 노드 찾기
			for (int i = 0; i < arr[now].size(); i++) {
				int next = arr[now].get(i);
				if (!visited[next]) {
					visited[next] = true;
					q.offer(next);
				}
			}
		}
	}
}

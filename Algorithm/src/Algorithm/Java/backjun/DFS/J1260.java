package Algorithm.Java.backjun.DFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J1260 {
	static int[][] arr;
	static int[] vst;

	private static void dfs(int V) {
		//매개변수로 넘어온 값을 vst에 방문 했다고 저장해준다
		//넘어온 값을 출력해준다.
		//arr에서 V행을 찾아본다
		//방문하지 않았고, 연결이 되어있다면 재귀호출한다.
		vst[V] = 1;
		System.out.print(V + " ");
		for (int i = 1; i < arr.length; i++) {
			if (arr[V][i] == 1) {
				if (vst[i] == 0) {
					dfs(i);
				}
			}
		}
	}

	private static void bfs(int V) {
		Queue<Integer> q = new LinkedList<>();
		q.add(V);
		vst[V] = 1;
		while (!q.isEmpty()) {
			int n = q.poll();
			System.out.print(n + " ");
			for (int i = 1; i < arr.length; i++) {
				if (arr[n][i] == 1 && vst[i] == 0) {
					q.add(i);
					vst[i] = 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), V = sc.nextInt();
		arr = new int[N + 1][N + 1];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		for (int[] ar : arr) {
			System.out.println(Arrays.toString(ar));
		}
		vst = new int[N + 1];
		dfs(V);
		System.out.println();
		vst = new int[N + 1];
		bfs(V);
	}

}

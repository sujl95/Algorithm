package Algorithm.Java.backjun.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class J11724_S2 {

	private static List<List<Integer>> list;
	private static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = input[0];
		int m = input[1];

		list = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
		}

		visited = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			int[] xy = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int x = xy[0];
			int y = xy[1];
			list.get(x).add(y);
			list.get(y).add(x);
		}

		int res = 0;

		for (int i = 1; i < n + 1; i++) {
			if (!visited[i]) {
				bfs(i);
				res++;
			}
		}
		System.out.println(res);
	}

	private static void bfs(int i) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(i);
		while (!queue.isEmpty()) {
			int now = queue.poll();
			visited[now] = true;
			for (int j = 0; j < list.get(now).size(); j++) {
				int value = list.get(now).get(j);
				if (!visited[value]) {
					visited[value] = true;
					queue.add(value);
				}
			}
		}
	}
}

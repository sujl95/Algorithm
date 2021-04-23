package Algorithm.Java.codingTest._202009Naver;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

class Solution {
	public ArrayList<Integer>[] map;
	public int[] solution(int n, int[][] edges) {
		int[] answer = new int[2];
		map = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			map[i] = new ArrayList<>();
		}
		for (int i = 0; i < edges.length; i++) {
			map[edges[i][0]].add(edges[i][1]);
			map[edges[i][1]].add(edges[i][0]);
		}
		int len = edges.length;
		for (int i = 0; i < edges.length; i++) {
			for (int j = i + 1; j < edges.length; j++) {
				if (bfs(i, j, edges, n)) {
					answer[0] = i;
					answer[1] = j;
					break;
				}
			}
		}
		return answer;
	}

	public boolean bfs(int a, int b, int[][] edges, int n) {
		Queue<Integer> queue = new ArrayDeque<>();
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				continue;
			}

			visited[i] = true;
			queue.add(i);
			int count = 0;
			while (!queue.isEmpty()) {
				int tmp = queue.poll();
				count++;
				for (int j = 0; j < map[tmp].size(); j++) {
					int next = map[tmp].get(j);
					if (visited[next]) {
						continue;
					}
					if (!checkUnLinked(tmp, next, a, b, edges)) {
						continue;
					}
					visited[next] = true;
					queue.add(next);
				}
			}
			if (count != n / 3) {
				return false;
			}
		}
		return true;
	}

	public boolean checkUnLinked(int x, int y, int a, int b, int[][] edges) {
		if ((x == edges[a][0] && y == edges[a][1]) || (y == edges[a][0] && x == edges[a][1])) {
			return false;
		} else
			return (x != edges[b][0] || y != edges[b][1]) && (y != edges[b][0] || x != edges[b][1]);
	}
}

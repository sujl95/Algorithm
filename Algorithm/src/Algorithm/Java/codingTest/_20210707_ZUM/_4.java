package Algorithm.Java.codingTest._20210707_ZUM;

import java.util.PriorityQueue;

public class _4 {

	public static void main(String[] args) {

	}

	public static int[] solution(int[][] data) {
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[2] == o2[2] ? o1[1] - o2[1] : o1[2] - o2[2]);
		pq.add(data[0]);
		int idx = 1;
		int arrIdx = 0;
		long time = data[0][1];
		int[] ans = new int[data.length];
		while (!pq.isEmpty()) {
			int[] now = pq.poll();
			ans[arrIdx] = now[0];
			time = time + now[2];
			while (idx < data.length && data[idx][1] <= time) {
				pq.add(data[idx]);
				idx++;
			}
			if (pq.isEmpty() && idx < data.length) {
				pq.add(data[idx]);
				idx++;
			}
			arrIdx++;
		}
		return ans;
	}

}

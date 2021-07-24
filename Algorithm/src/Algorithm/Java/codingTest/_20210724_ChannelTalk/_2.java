package Algorithm.Java.codingTest._20210724_ChannelTalk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _2 {

	public static void main(String[] args) {
		System.out.println(solution(1, 1, 1, 1));
	}

	public static int solution(int n, int m, int x, int y) {
		int answer = -1;
		Map<Integer, int[]> directionMap = new HashMap<>();
		directionMap.put(1, new int[] {0, 1});
		directionMap.put(2, new int[] {-1, 0});
		directionMap.put(3, new int[] {0, -1});
		directionMap.put(4, new int[] {1, 0});
		PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
		int[][] dp = new int[n + 1][m + 1];
		for (int[] ints : dp) {
			Arrays.fill(ints, 1000000);
		}
		pq.add(new int[] {0, 0, 0, 1});
		dp[0][0] = 0;
		while (!pq.isEmpty()) {
			int[] arr = pq.poll();
			int row = arr[0];
			int col = arr[1];
			int orderNum = arr[2];
			int robotDirection = arr[3];
			if (row == x && col == y) {
				answer = orderNum;
				break;
			}
			if (!((row >= 0 && row <= n) && (col >= 0 && col <= m))) {
				continue;
			}
			int[] dir = directionMap.get(robotDirection);
			int endRow = dir[0] + row;
			int endCol = dir[1] + col;
			pq.add(new int[] {row, col, orderNum + 1, robotDirection == 4 ? 1 : robotDirection + 1});
			if ((endRow >= 0 && endRow <= n) && (endCol >= 0 && endCol <= m)) {
				if (dp[endRow][endCol] > orderNum + 1) {
					dp[endRow][endCol] = orderNum + 1;
					pq.add(new int[] {dir[0] + row, dir[1] + col, orderNum + 1,
							robotDirection == 4 ? 1 : robotDirection + 1});
				}
			}
			int tmpRobotDirection = robotDirection == 4 ? 1 : robotDirection + 1;
			int[] tmpDir = directionMap.get(tmpRobotDirection);
			endRow = tmpDir[0] + row;
			endCol = tmpDir[1] + col;
			if ((endRow >= 0 && endRow <= n) && (endCol >= 0 && endCol <= m)) {
				if (dp[endRow][endCol] > orderNum + 1) {
					dp[endRow][endCol] = orderNum + 1;
					pq.add(new int[] {endRow, endCol, orderNum + 1, tmpRobotDirection});
				}
			}
		}
		return answer;
	}
}

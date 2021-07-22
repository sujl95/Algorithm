package Algorithm.Java.programmers.level2._2021Dev_Matching;

import java.util.Arrays;

public class P77485_Array_Board_Turn {

	public static void main(String[] args) {
		// int rows = 6;
		// int columns = 6;
		// int[][] queries = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};
		int rows = 3;
		int columns = 3;
		int[][] queries = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
		System.out.println(Arrays.toString(solution(rows, columns, queries)));
	}

	public static int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];
		int[][] map = new int[rows + 1][columns + 1];
		int setCount = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				map[i][j] = setCount++;
			}
		}
		for (int i = 0; i < queries.length; i++) {
			int min = Integer.MAX_VALUE;
			int[] query = queries[i];
			int temp = map[query[0]][query[1]];
			min = Math.min(min, temp);
			for (int j = query[0]; j < query[2]; j++) {
				map[j][query[1]] = map[j + 1][query[1]];
				min = Math.min(min, map[j][query[1]]);
			}
			for (int j = query[1]; j < query[3]; j++) {
				map[query[2]][j] = map[query[2]][j + 1];
				min = Math.min(min, map[query[2]][j]);
			}
			for (int j = query[2]; j > query[0]; j--) {
				map[j][query[3]] = map[j - 1][query[3]];
				min = Math.min(min, map[j][query[3]]);
			}
			for (int j = query[3]; j > query[1]; j--) {
				map[query[0]][j] = map[query[0]][j - 1];
				min = Math.min(min, map[query[0]][j]);
			}
			map[query[0]][query[1] + 1] = temp;
			answer[i] = Math.min(min, temp);
		}
		return answer;
	}

}

package Algorithm.Java.codingTest._20210403_DevMatching;

import java.util.Arrays;

public class _2 {
	public static void main(String[] args) {
		int rows = 6;
		int columns = 6;
		int[][] queries = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};
		System.out.println(Arrays.toString(solution(rows, columns, queries)));
	}

	public static int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = {};
		int[][] arr = new int[rows][columns];
		int value = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = value++;
			}
		}
		System.out.println("arr = " + Arrays.deepToString(arr));
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[1][3]);

		System.out.println(arr[2][3]);
		System.out.println(arr[3][3]);

		System.out.println(arr[4][3]);
		System.out.println(arr[4][2]);
		System.out.println(arr[4][1]);

		System.out.println(arr[3][1]);
		System.out.println(arr[2][1]);
		System.out.println(arr[1][1]);
		for (int i = 0; i < 5 - 2 + 1; i++) {
			for (int j = 0; j < 4 - 2 + 1; j++) {
				System.out.println("arr[i][j] = " + arr[i][j]);
			}
		}
		boolean check = true;
		int x = queries[0][0] - 1;
		int y = queries[0][1] - 1;
		int x1 = queries[0][2] - 1;
		int y1 = queries[0][3] - 1;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("x1 = " + x1);
		System.out.println("y1 = " + y1);

		int[] point1 = {x, y};
		int[] point2 = {x1, y};
		int[] point3 = {x1, y1};
		int[] point4 = {x, y1};
		int[] point5 = {x, y};


		return answer;
	}
}

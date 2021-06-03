package Algorithm.Java.backjun.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J2667 {
	static int[][] arr,wh = new int[][] {{1,0,-1,0} , {0,1,0,-1}};
	static int cnt = 0;

	private static void dfs(int a, int b) {
		arr[a][b] = 0;
		cnt++;
		for (int i = 0; i < 4; i++) {
			int aa = a + wh[0][i];
			int bb = b + wh[1][i];
			if (0 <= aa && aa < arr.length && 0 <= bb && bb < arr.length) {
				if (arr[aa][bb] == 1) {
					dfs(aa, bb);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n][];
		for(int i = 0; i<n; i++) {
			arr[i] = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1) {
					dfs(i, j);
				}
				list.add(cnt);
				cnt = 0;
			}
		}
		list.sort(null);
		int danji = 0;
		for (Integer integer : list) {
			if (integer != 0) {
				danji++;
			}
		}
		System.out.println(danji);
		for (Integer integer : list) {
			if (integer != 0) {
				System.out.println(integer);
			}
		}
	}

}

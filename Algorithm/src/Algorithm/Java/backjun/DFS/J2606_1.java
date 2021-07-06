package Algorithm.Java.backjun.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class J2606_1 {
	private static int[] vst;
	private static int[][] arr;
	private static int cnt =0;
	private static void dfs(int a) {
		//매개변수로 넘어온 값을 vst에 방문 했다고 저장해준다
		//넘어온 값을 출력해준다.
		//arr에서 V행을 찾아본다
		//방문하지 않았고, 연결이 되어있다면 재귀호출한다.
		vst[a] = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[a][i] == 1) {
				if (vst[i] == 0) {
					dfs(i);
					cnt++;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N = sc.nextInt();
		arr = new int[T + 1][T + 1];
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			arr[x][y] = arr[y][x] = 1;
		}
		for (int[] ar : arr) {
			System.out.println(Arrays.toString(ar));
		}
		vst = new int[N + 1]; dfs(1);
		System.out.println(cnt);
		System.out.println(Arrays.toString(vst));
	}

}

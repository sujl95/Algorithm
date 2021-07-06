package Algorithm.Java.backjun.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class J2606 {
	private static int arr[][] = {};
	private static int vst[] = {};
	private static int cnt =0;
	private static void dfs(int n) {
		//매개변수로 넘어온 값을 vst에 방문 했다고 저장해준다
		//넘어온 값을 출력해준다.
		//arr에서 V행을 찾아본다
		//방문하지 않았고, 연결이 되어있다면 재귀호출한다.
		vst[n]= 1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[n][i] == 1) {
				if(vst[i] == 0) {
					dfs(i);
					cnt++;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), V = sc.nextInt();
		arr = new int[N + 1][N + 1];
		for (int i = 0; i < V; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		for (int[] ar : arr) {
			System.out.println(Arrays.toString(ar));
		}
		vst = new int[N+1];
		dfs(1);
		System.out.println(cnt);
	}

}

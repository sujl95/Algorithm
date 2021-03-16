package Algorithm.Java.backjun.DFS;

import java.util.Scanner;

public class J1012 {
	static int arr[][] ,wh[][] = new int[][] {{1,0,-1,0} , {0,1,0,-1}};
	static int cnt =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int M = sc.nextInt(), N = sc.nextInt(),K=sc.nextInt();
			arr = new int[M][N];
			for (int j = 0; j < K; j++) {
				int x= sc.nextInt(), y = sc.nextInt();
				arr[x][y] = 1;
			}
			int res =0;
			for(int n =0; n <M; n++) {
				for(int m=0; m<N; m++) {
					if(arr[n][m] ==1 ) dfs(n,m);
					res += (cnt!= 0) ? 1 : 0; cnt = 0;
				}
			}
			System.out.println(res);
		}
	}
	static void dfs(int a , int b) {
		arr[a][b] = 0 ; cnt++;
		for(int i =0; i<4; i++) {
			int aa = a+ wh[0][i];
			int bb = b+ wh[1][i];
			if(0 <= aa && aa < arr.length && 0 <= bb && bb < arr[0].length) {
				if(arr[aa][bb] == 1) dfs(aa,bb);
			}
		}
	}
}
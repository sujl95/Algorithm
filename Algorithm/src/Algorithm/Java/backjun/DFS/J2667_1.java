package Algorithm.Java.backjun.DFS;

import java.util.Arrays;
import java.util.Scanner;

public class J2667_1 {
	static int arr[][] = {};
	static int cnt=0;
	static int danji=0;
	static void dfs(int a,int b) {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N][];
		for (int i = 0; i < N; i++) {
			arr[i] = Arrays.stream(sc.next().split("")).mapToInt(s -> Integer.parseInt(s)).toArray();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(arr[i][j] == 1) dfs(i,j);
				
			}
		}
	}

}

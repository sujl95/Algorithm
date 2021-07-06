package Algorithm.Java.backjun.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J7576 {
	private static int[][] tomato,wh= {{1,0,-1,0},{0,1,0,-1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M=sc.nextInt(), N=sc.nextInt(), max=0, cnt=0;
		Queue<int[]> q = new LinkedList<>();
		tomato= new int[N][M];
		for(int i=0;i<N;i++) {
			for (int j = 0; j < M; j++) {
				int x =sc.nextInt();
				tomato[i][j] = x;
				if(x==0 ) {
					cnt++;
				} else if(x==1) {
					q.add(new int[] {i,j,0});
				}
			}
//			System.out.println(cnt);
//			System.out.println(Arrays.toString(tomato[i]));
			
		}
		while(!q.isEmpty()) {
//			System.out.println(Arrays.deepToString(q.toArray()));
			int arr[] = q.poll();
			
			max =Math.max(max,arr[2]);
			for(int i=0;i<4;i++) {
				int x = arr[0] + wh[0][i];
				int y = arr[1] + wh[1][i];
				if(0 <= x && 0 <=y && x <N && y < M) {
					if(tomato[x][y] == 0 ) {
						q.add(new int[] {x,y,arr[2]+1});
						tomato[x][y]=1;
						cnt--;
					}
				}
			}
		}
		System.out.println(cnt==0 ? max : -1);
//		System.out.println(Arrays.deepToString(tomato));
	}
	
}

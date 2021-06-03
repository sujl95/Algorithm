package Algorithm.Java.backjun.dfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J2178 {
	static int[][] arr,wh= {{1,0,-1,0},{0,1,0,-1}} ;
	static boolean[][] visited ;
	static int N ,M;
	 public static void bfs(int i, int j){
	        Queue<int[]> q = new LinkedList<>();
	        q.offer(new int[] {i,j});

	        while(!q.isEmpty()) {
				System.out.println(Arrays.deepToString(q.toArray()));
				int[] location = q.poll();
				visited[i][j] = true;

				for (int dir = 0; dir < 4; dir++) {
					int r = location[0] + wh[0][dir];
					int c = location[1] + wh[1][dir];

					//좌표가 -1이 되거나 N or M이 되어 map의 범위를 벗어나면 안되므로
					if (r >= 0 && c >= 0 && r < N && c < M) {
						if (arr[r][c] != 0 && !visited[r][c]) {
							q.offer(new int[] {r, c});
							visited[r][c] = true;
							arr[r][c] = arr[location[0]][location[1]] + 1;
						}
					}
				}
	        }
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N][]; 
		visited=new boolean[N][M];
		for (int i = 0; i < N; i++) {
			arr[i] = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
		}
		
		bfs(0,0);
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(visited));
		System.out.println(arr[N-1][M-1]);
	}
}

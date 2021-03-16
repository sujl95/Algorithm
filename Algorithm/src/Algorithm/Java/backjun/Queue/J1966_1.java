package Algorithm.Java.backjun.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J1966_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N =sc.nextInt(), M =sc.nextInt();
			Queue<Integer> q = new LinkedList<>();
			Queue<Integer> q1 = new LinkedList<>();
			int[] arr = new int[N];
			for(int j=0;j<N;j++) {
				int in = sc.nextInt();
				q.add(in);
				q1.add(j);
			}
			System.out.println(Arrays.toString(q.toArray()));
			System.out.println(Arrays.toString(q1.toArray()));
		}
		
	}
	
	
}

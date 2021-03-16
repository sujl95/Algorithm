package Algorithm.Java.backjun.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Scanner(System.in).nextInt();
		if(n==1) {
			System.out.println(1);
			return;
		}
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<n+1; i++)
			q.add(i);
		while(true) {
			q.poll();
			if(q.size() == 1) break;
			q.add(q.poll());
		}
		System.out.println(q.poll());
	}

}

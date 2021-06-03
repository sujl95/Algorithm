package Algorithm.Java.backjun.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J18258 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			switch(sc.next()) {
				case "push" : 
					int put =sc.nextInt();
					System.out.println(q.add(put) ? put : -1 ); break; 
				case "front" : System.out.println(q); break;
				case "back" : System.out.println(); break;
				case "empty" : System.out.println(q.isEmpty() ? "1" : "0"); break;
				case "pop" : System.out.println(q.poll()); break;
				case "size" : System.out.println(q.size()); break;
			}
		}
	}
}

package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class J1966_S3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int testCase = 0; testCase < T; testCase++) {
			Queue<Position> queue = new ArrayDeque<>();
			int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int M = input[1];
			int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for (int i = 0; i < arr.length; i++) {
				int value = arr[i];
				queue.offer(new Position(i, value));
			}
			int res = 0;
			while(!queue.isEmpty()) {
				Position now = queue.poll();
				int size = queue.size();
				boolean ck = false;
				while(size > 0) {
					size--;
					Position next = queue.poll();
					if (now.priority < next.priority) {
						ck = true;
					}
					queue.offer(next);
				}
				if (ck) {
					queue.offer(now);
				} else {
					res++;
					if (M == now.index) {
						System.out.println(res);
						break;
					}
				}
			}
		}
	}
}

class Position {

	int index;
	int priority;

	public Position(int index, int priority) {
		this.index = index;
		this.priority = priority;
	}

}
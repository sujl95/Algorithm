package Algorithm.Java.programmers.level2.heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class P42626_More_Spicy {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 2, 3, 9, 10, 12}, 7));
	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<>(Arrays.stream(scoville).boxed().collect(Collectors.toList()));
		while (queue.peek() <= K) {
			if (queue.size() == 1) {
				return -1;
			}
			queue.offer(queue.poll() + queue.poll() * 2);
			answer++;
		}
		return answer;
	}


}

package Algorithm.Java.programmers.level2.stackqueue;

import java.util.Collections;
import java.util.PriorityQueue;


public class P42587_Printer {
	public static void main(String[] args) {
		int[] priorities = new int[] {2, 1, 3, 2};
		int location = 2;

		System.out.println(solution(priorities, location));
	}

	public static int solution(int[] priorities, int location) {
		/**
		 * 입력을 받는다
		 * 1. location 만큼 배열 생성
		 */
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int priority : priorities) {
			pq.add(priority);
		}

		while(!pq.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (pq.peek() == priorities[i]) {
					pq.poll();
					answer++;
					if (i == location) {
						pq.clear();
						break;
					}
				}
			}
		}
		return answer;
	}
}

package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class test2 {

	public static void main(String[] args) {
		int[] a = {13, 7, 3, 7, 16, 12};        //4, 3, 1, 1, -1, -1
		List<Integer> c = new ArrayList<>();
		for (int i = 0; i < 500000; i++) {
			c.add((int)(Math.random() * 100000) + 1);
		}
		int[] d = c.stream().mapToInt(i -> i).toArray();
		long beforeTime = System.currentTimeMillis();
		System.out.println(beforeTime);
		int[] b = solution(d);
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		for (int i : c) {
			System.out.print(i + ", ");
		}
		for (int i : b) {
			System.out.print(i + ", ");
		}
		System.out.println();
		double secDiffTime = (afterTime - beforeTime) / (double)1000; //두 시간에 차 계산
		System.out.println("시간차이(m) : " + secDiffTime);
	}

	public static int[] solution(int[] price) {
		Stack<Integer> st = new Stack<>();
		int[] res = new int[price.length];
		for (int i = 0; i < price.length; i++) {
			while (!st.isEmpty() && price[st.peek()] < price[i]) {
				res[st.peek()] = i - st.pop();
			}
			st.push(i);
		}
		return res;
	}
}

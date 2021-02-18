package Algorithm.Java.programmers.Stack;

import java.util.*;

public class P42588 {

	public static void main(String[] args) {
		//https://programmers.co.kr/learn/courses/30/lessons/42588
		//탑
		int in[] = {6, 9, 5, 7, 4};
		System.out.println(Arrays.toString(solution(in)));
	}
	public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
			stk.push(heights[i]);
		}
        for (int i = heights.length-1; i >=0 ; i--) {
        	for (int j = i; j >=0 ; j--) {
        		if(stk.get(i) < stk.get(j) ) {
    				answer[i]= j+1;
    				break;
    			} 
			}
		}
        return answer;
    }
}

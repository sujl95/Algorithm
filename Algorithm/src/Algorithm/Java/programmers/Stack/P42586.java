package Algorithm.Java.programmers.Stack;

import java.util.*;

public class P42586 {

	public static void main(String[] args) {
		//https://programmers.co.kr/learn/courses/30/lessons/42586
		//기능개발
		int in[] = {93,30,55};
		int speeds[] = {1,30,5};
		System.out.println(Arrays.toString(solution(in,speeds)));
	}
	public static int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		//q의 사이즈는 poll 수행시 변경되므로 for문에서 고정조건으로 사용할 시 변수에 사이즈를 따로 담아둔다.
        int num = 0;
        int len = progresses.length;
        for(int i = 0; i <= len; i++) {
            if(i == len) { 
                q.add(num);
                break;
            }
            if(progresses[i] >= 100) {
                num++;
                continue;
            }
            if(num != 0) {
                q.add(num);
            }
            num = 0;
            int remain = 100 - progresses[i];
            int day = remain / speeds[i]; // 100프로 달성까지 걸리는 일수 
            if(remain % speeds[i] != 0) day++;
             
            for(int j = i; j < len; j++){
                progresses[j] += (day * speeds[j]);
            }
            num++;
        }
        int[] answer = new int[q.size()];
        for(int i = 0; i < answer.length; i++){
        	answer[i] = q.poll();
        }
        return answer;
	}
}

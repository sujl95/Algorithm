package Algorithm.Java.programmers.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class P12906 {
	//같은 숫자는 싫어
	//https://programmers.co.kr/learn/courses/30/lessons/12906
	public static void main(String[] args) {
		int in[] = {4,4,4,3,3};
		System.out.println(Arrays.toString(solution(in)));
	}
	
	public static int[] solution(int []arr) {
        ArrayList<Integer> answer1 = new ArrayList<>();
        for(int i=0 ; i<arr.length; i++) {
        	if(i ==0) {
        		answer1.add(arr[i]);
        		continue;
        	}
        	if(arr[i] != arr[i-1]) {
        		answer1.add(arr[i]);
        	}
        }
        int answer[] = new int [answer1.size()];
        for(int i=0; i<answer1.size(); i++) {
        	answer[i] = answer1.get(i);
        }
        return answer;
	}
}

package Algorism.Java.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P12933 {

	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/12933
		// 정수 내림차순으로 배치하기
		System.out.println(solution(118372));
	}
	public static long solution(long n) {
		
	    long answer = 0;
	    ArrayList<Long> list =new ArrayList<>();
	    
	    String arr[] = (n+"").split("");
	    Arrays.sort(arr);
	    for(int i=0; i<arr.length; i++) {
	    	list.add(Long.parseLong(arr[i]));
	    }
	    Collections.reverse(list);
	    String ans="";
	    for(int i =0;i<list.size(); i++) {
	    	ans += list.get(i);
	    }
	    answer = Long.parseLong(ans);
	    return answer;
	}
}

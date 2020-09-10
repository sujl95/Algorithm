package Algorism.programmers;

import java.util.*;

public class P12932 {

	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/12932
		// 자연수 뒤집어 배열로 만들기
		System.out.println(Arrays.toString(solution(12345)));
	}
	public static int[] solution(long n) {
		 String arr[] = (n+"").split("");
	      int[] answer = new int[arr.length];
	      int cnt =0;
	      for (int i =arr.length-1; i>=0; i--) {
		        answer[cnt] = Integer.parseInt(arr[i]);
		        cnt++;
		  }
	      return answer;
	}
}

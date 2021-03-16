package Algorithm.Java.programmers.practice;

import java.util.Arrays;

public class P12940 {

	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/12940
		// 최대공약수와 최소 공배수
		System.out.println(Arrays.toString(solution(10,12)));
	}
	public static int[] solution(int n, int m) {
	      int[] answer = new int[2];
	      int length =(n<m) ? m : n;
	      for(int i=1; i<=length; i++) {
	    	  if(n%i == 0 && m%i==0) {
	    		  answer[0] = i;
	    	  }
	    	  
	      }
	      answer[1] = (n*m)/answer[0];
	      
	      return answer;
	  }
}

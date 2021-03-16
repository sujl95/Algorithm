package Algorithm.Java.programmers.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class P12935 {

	public static void main(String[] args) {
		//https://programmers.co.kr/learn/courses/30/lessons/12935
		//제일 작은 수 제거하기
		Solution sol = new Solution();
		int arr[] = {10};
		
		System.out.println(Arrays.toString(sol.solution(arr)));
		

	}
	
}

class Solution {
	  public int[] solution(int[] arr) {
	      ArrayList<Integer> list = new ArrayList<>();
	      int ck = arr[0];
	      int posi =0;
	      int length = (arr.length==1) ? 1 : arr.length-1;
	      int []answer = new int[length];
	      if(arr.length != 1) {
	    	  for(int i=0; i<arr.length; i++) {
	    		  list.add(arr[i]);
	    		  if(ck > arr[i] ) {
	    			  ck =arr[i];
	    			  posi =i;
	    		  }
	    	  }
	    	  list.remove(posi);

		      for (int i=0; i<answer.length; i++) {
		    	  answer[i] = list.get(i);
		      }
	      } else  {
	    	  answer[0] = -1;
	      }
	      
	      return answer;
	  }
	}
package Algorithm.Java.programmers.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class P42842 {
	static List<Integer> list;
	static void yaksu(int n) {
		list = new ArrayList<>();
		for(int i =1; i <=n; i++) {
			if(n% i==0) list.add(i);
		}
	}
	public static void main(String[] args) {
		yaksu(30);
		for(int i : list) System.out.println(i);
	}
	static class Solution {
	    public int[] solution(int brown, int red) {
	    	int[] answer = {};
	        int sum = brown + red;
	        for(int i = sum ; i>0; i--) {
	        	if (sum % i == 0) {
	        		if((i-2) * ((sum/i)-2) ==red) {
	        			return new int[] {i,sum/i};
	        		}
	        		
	        	}
	        }
	        
	        return null;
	    }
	}
}

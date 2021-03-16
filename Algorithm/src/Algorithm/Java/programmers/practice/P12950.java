package Algorithm.Java.programmers.practice;

import java.util.Arrays;

public class P12950 {

	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/12950
		//행렬의 덧셈
		int put[][] = {{1, 2}, {2, 3}};
		int put1[][] ={{3, 4}, {5, 6}};
		int put2[][] = {{1}, {2}};
		int put3[][] ={{3}, {4}};
		System.out.println(Arrays.toString(solution(put,put)));

	}
	public static int[][] solution(int[][] arr1, int[][] arr2) {
	    int[][] answer = new int[arr1.length][arr1[0].length];
	    for(int i=0; i<arr1.length; i++) {
	    	for(int j=0; j<arr1[0].length;j++) {
	    		answer[i][j] = arr1[i][j]+arr2[i][j]; 
	    	}
	    }
	    return answer;
	    
	}
}

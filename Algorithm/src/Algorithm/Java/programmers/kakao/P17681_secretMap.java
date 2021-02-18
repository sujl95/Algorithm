package Algorithm.Java.programmers.kakao;

import java.util.Arrays;

public class P17681_secretMap {

	public static void main(String[] args) {
		int[] arr1 ={46, 33, 33, 22, 31, 50};
		int[] arr2 = {27, 56, 19, 14, 14, 10};
		System.out.println(Arrays.toString(solution(6, arr1, arr2)));
	}


	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0 ; i<n; i++) {
        	answer[i]= String.format("%"+n+"s",
					(Integer.toBinaryString(arr1[i] | arr2[i])).replaceAll("1", "#").replaceAll("0"," "));
        }
        return answer;
    }
}

package Algorism.programmers.kakao;

import java.util.Arrays;

public class P17681_secretMap {

	public static void main(string[] args) {
		int[] arr1 ={46, 33, 33, 22, 31, 50};
		int[] arr2 = {27, 56, 19, 14, 14, 10};
		system.out.println(arrays.tostring(solution(6, arr1, arr2)));
	}


	public static string[] solution(int n, int[] arr1, int[] arr2) {
        string[] answer = new string[n];
        for(int i = 0 ; i<n; i++) {
        	answer[i]= string.format("%"+n+"s",(integer.tobinarystring(arr1[i] | arr2[i])).replaceall("1", "#").replaceall("0"," "));
        }
        return answer;
    }
}

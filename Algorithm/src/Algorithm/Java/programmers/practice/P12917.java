package Algorithm.Java.programmers.practice;

import java.util.Arrays;
import java.util.Comparator;

public class P12917 {

	public static void main(String[] args) {
		// 문자열 내림차순으로 배치하기
		// https://programmers.co.kr/learn/courses/30/lessons/12917
		System.out.println(solution("Zbcdefg"));
	   
	}
	public static String solution(String s) {
        String answer = "";
        String str[] = s.split("");
        Arrays.sort(str,Comparator.reverseOrder());
        for(int i=0; i<str.length; i++) {
        	answer+=str[i];
        }
        return answer;
    }

}

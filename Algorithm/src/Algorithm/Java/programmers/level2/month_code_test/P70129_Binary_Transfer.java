package Algorithm.Java.programmers.level2.month_code_test;

import java.util.Arrays;

public class P70129_Binary_Transfer {

	public static void main(String[] args) {
		System.out.println("solution(\"110010101001\") = " + Arrays.toString(solution("110010101001")));
	}

	public static int[] solution(String s) {
		int[] answer = new int[2];
		int length ;
		while (!s.equals("1")) {
			int beforeCount = s.length();
			s = s.replaceAll("0", "");
			int afterCount = s.length();
			length = beforeCount - afterCount;
			answer[1] += length;
			answer[0]++;
			s = Integer.toBinaryString(s.length());
		}
		return answer;
	}


}

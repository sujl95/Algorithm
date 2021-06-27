package Algorithm.Java.backjun.Greedy;

import java.util.Scanner;

public class J1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("\\-");
		int minResult = 0;
		for (int i = 0; i < input.length; i++) {
			int calcNum = calc(input[i]);
			if (i == 0) {
				calcNum *= -1;
			}
			minResult -= calcNum;
		}
		System.out.println(minResult);
	}

	private static int calc(String str) {
		String[] subNums = str.split("\\+");
		int result = 0;
		for (String item : subNums) {
			result += Integer.parseInt(item);
		}
		return result;
	}
}

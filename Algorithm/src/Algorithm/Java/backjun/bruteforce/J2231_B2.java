package Algorithm.Java.backjun.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J2231_B2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < 54; i++) {
			int temp = 54 - i;
			if (n <= temp) {
				continue;
			}
			if (digitSum(n - temp) == temp) {
				System.out.println(n - temp);
				return;
			}
		}
		System.out.println(0);
	}

	public static int digitSum(int n) {
		return Arrays.stream(Integer.toString(n)
				.split(""))
				.mapToInt(Integer::parseInt)
				.sum();
	}

}

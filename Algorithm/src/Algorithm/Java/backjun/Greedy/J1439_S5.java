package Algorithm.Java.backjun.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J1439_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("");
		StringBuilder str = new StringBuilder(input[0]);
		String temp = input[0];
		for (String value : input) {
			if (temp.equals(value)) {
				continue;
			}
			temp = value;
			str.append(value);
		}
		int zero = (int) Arrays.stream(str.toString().split("")).filter(s -> s.equals("0")).count();
		int one = (int) Arrays.stream(str.toString().split("")).filter(s -> s.equals("1")).count();
		System.out.println(Math.min(one, zero));
	}
}

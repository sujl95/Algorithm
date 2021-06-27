package Algorithm.Java.backjun.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J1541_S2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("\\-");
		int res = 0;
		for (int i = 0; i < input.length; i++) {
			res -= Arrays.stream(input[i].split("\\+")).mapToInt(Integer::parseInt).sum();
			if (i == 0) {
				res *= -1;
			}
		}
		System.out.println(res);
	}
}

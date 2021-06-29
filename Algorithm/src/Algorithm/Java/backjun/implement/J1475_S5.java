package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J1475_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] res = new int[9];
		int[] arr = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
		for (int j : arr) {
			int value = j;
			if (value == 6 || value == 9) {
				value = 6;
			}
			res[value] += 1;
		}
		res[6] = (int)Math.ceil((double)res[6] / 2);
		System.out.println(Arrays.stream(res).max().getAsInt());
	}
}

package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J11723_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[21];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			String[] input = br.readLine().split(" ");
			String cal = input[0];
			int value = 0;
			if (input.length == 2) {
				value = Integer.parseInt(input[1]);
			}
			if ("add".equals(cal)) {
				arr[value] = true;
			} else if ("remove".equals(cal)) {
				arr[value] = false;
			} else if ("check".equals(cal)) {
				sb.append(arr[value] ? 1 : 0).append("\n");
			} else if ("toggle".equals(cal)) {
				arr[value] = !arr[value];
			} else if ("all".equals(cal)) {
				Arrays.fill(arr, true);
				arr[0] = false;
			} else if ("empty".equals(cal)) {
				Arrays.fill(arr, false);
			}
		}
		System.out.println(sb);
	}
}

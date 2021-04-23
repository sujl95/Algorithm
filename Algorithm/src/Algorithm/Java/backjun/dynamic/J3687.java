package Algorithm.Java.backjun.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J3687 {

	static int T;
	static int N;
	static int[] Min;
	static int[] table;
	static StringBuilder result;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		table = new int[] {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		Min = new int[100 + 1];
		Arrays.fill(Min, -1);
		result = new StringBuilder();
		T = Integer.parseInt(bf.readLine());
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(bf.readLine());
			sb = new StringBuilder();
			findMin(N);
			result.append(sb).append(" ");
			sb = new StringBuilder();
			findMax(N);
			result.append(sb).append("\n");
		}
		System.out.println(result);
	}

	public static void findMax(int value) {
		if (value == 0) {
			return;
		}
		int temp = 0;
		int max = 0;
		int temp_max;
		for (int i = 0; i < 10; i++) {
			if (value - table[i] < 0) {
				continue;
			}
			if (sb.length() == 0 && i == 0) {
				continue;
			}
			temp_max = (value - table[i]) / 2;
			if (max <= temp_max) {
				max = temp_max;
				temp = i;
			}
		}
		sb.append(temp);
		findMax(value - table[temp]);
	}

	public static void findMin(int value) {
		if (value == 0) {
			return;
		}
		int temp = 0;
		int min = Integer.MAX_VALUE;
		int temp_min;
		for (int i = 0; i < 10; i++) {
			if (sb.length() == 0 && i == 0) {
				continue;
			}
			if (value - table[i] < 0) {
				continue;
			}
			temp_min = getMin(value - table[i]);
			if (temp_min == 0) {
				continue;
			}
			if (min > temp_min) {
				min = temp_min;
				temp = i;
			}
		}
		sb.append(temp);
		findMin(value - table[temp]);
	}

	public static int getMin(int idx) {
		if (idx == 0) {
			return -1;
		}
		if (idx == 1) {
			return 0;
		}
		if (idx <= 7) {
			return 1;
		}
		if (Min[idx] != -1) {
			return Min[idx];
		}
		Min[idx] = Integer.MAX_VALUE;
		for (int i = 0; i < 10; i++) {
			if (idx - table[i] < 2) {
				continue;
			}
			Min[idx] = Math.min(Min[idx], getMin(idx - table[i]) + 1);
		}
		return Min[idx];
	}
}

package Algorithm.Java.backjun.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class J10815_S4 {


	private static int N;
	private static int M;
	private static int[] arr;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr);
		int M = Integer.parseInt(br.readLine());
		int[] mArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			if (search(mArr[i])) {
				sb.append(1).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}

	private static boolean search(int n) {
		int left = 0;
		int right = N - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			int midValue = arr[mid];
			if (n < midValue) {
				right = mid - 1;
			} else if (n > midValue) {
				left = mid + 1;
			} else {
				return true;
			}
		}
		return false;
	}
}

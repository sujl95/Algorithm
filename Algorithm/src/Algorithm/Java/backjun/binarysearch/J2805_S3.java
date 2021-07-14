package Algorithm.Java.backjun.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J2805_S3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int start = 0;
		int end = Arrays.stream(arr).max().getAsInt();
		int target = input[1];
		while (start <= end) {
			long total = 0;
			int mid = (start + end) / 2;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] - mid >= 0) {
					total += arr[i] - mid;
				}
			}
			if (target > total) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println(end);
	}
}

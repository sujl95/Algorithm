package Algorithm.Java.ThisisCodingTest.binarysearch;

import java.util.Arrays;

public class BinarySearch_RiceCake {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {4, 6}, new int[] {19, 15, 10, 17}));
		
	}

	private static int solution(int[] input, int[] arr) {
		
		int start = 0;
		int end = Arrays.stream(arr).max().getAsInt();
		int result = 0;
		int target = input[1];
		while (start <= end) {
			int total = 0;
			int mid = (start + end) / 2;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] - mid > 0) {
					total += arr[i] - mid;
				}
			}
			if (target == total) {
				return mid;
			} else if (target > total) {
				end = mid - 1;
			} else if (target < total) {
				start = mid + 1;
			}
		}
		return 0;
	}

}

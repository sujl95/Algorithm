package Algorithm.Java.ThisisCodingTest.binarysearch;

import java.util.Arrays;

public class binarySearch {
	public static void main(String[] args) {
		int N = 5;
		int[] array = new int[] {8, 3, 7, 9, 2};
		Arrays.sort(array);
		int M = 3;
		int[] target = new int[] {5, 7, 9};

		for (int i : target) {
			int result = binarySearch(array, i, 0, N - 1);
			if (result == 0) {
				System.out.print("no ");
			} else {
				System.out.print("yes ");
			}
		}
	}

	public static int binarySearch(int[] array, int target, int start, int end) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return 0;
	}
}

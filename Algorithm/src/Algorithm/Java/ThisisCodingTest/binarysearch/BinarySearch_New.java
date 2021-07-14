package Algorithm.Java.ThisisCodingTest.binarysearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch_New {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};


		int start = 0;
		int end = arr.length - 1;
		int target = 7;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				System.out.println(mid + 1);
				return;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		System.out.println("None");
		return;
	}

}

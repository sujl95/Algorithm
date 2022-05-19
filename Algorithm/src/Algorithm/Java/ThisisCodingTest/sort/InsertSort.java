package Algorithm.Java.ThisisCodingTest.sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
//		insertSort1(arr);
		insertSort2(arr);

		System.out.println("arr = " + Arrays.toString(arr));
	}

	private static void insertSort2(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				} else {
					break;
				}
			}
		}
	}

	private static void insertSort1(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1]= arr[j];
					arr[j]= temp;
				} else {
					break;
				}
			}
		}
	}
}

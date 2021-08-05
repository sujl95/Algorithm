package Algorithm.Java.sort;

import java.util.Arrays;

public class QuickSort_2 {

	public static void main(String[] args) {
		int[] arr = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
		int start = 0;
		int end = arr.length - 1;
		System.out.println("arr = " + Arrays.toString(arr));
		quickSort(arr, start, end);
		System.out.println("arr = " + Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		int left = start;
		int right = end;
		int pivot = arr[(start + end) / 2];
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (pivot < arr[right]) {
				right--;
			}
			if (left <= right) {
				if (left != right) {
					int temp = arr[right];
					arr[right] = arr[left];
					arr[left] = temp;
				}
				left++;
				right--;
			}
		}
		if (start < right) {
			quickSort(arr, start, right);
		}
		if (left < end) {
			quickSort(arr, left, end);
		}
	}

}

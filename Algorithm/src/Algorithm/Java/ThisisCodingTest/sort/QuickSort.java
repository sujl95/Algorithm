package Algorithm.Java.ThisisCodingTest.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
		System.out.println("arr = " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println("arr = " + Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}
		int pivot = start;
		int left = start + 1;
		int right = end;
		while (left <= right) {
			// 피벗보다 큰 데이터를 찾을 때까지 반복
			while (left <= end && arr[left] <= arr[pivot]) {
				left++;
			}
			// 피벗보다 작은 데이터를 찾을 때까지 반복
			while (right > start && arr[right] >= arr[pivot]) {
				right--;
			}
			// 엇갈렸다면 right 데이터와 피벗을 교체
			if (left > right) {
				int temp = arr[right];
				arr[right] = arr[pivot];
				arr[pivot] = temp;
			// 엇갈리지 않았다면 right 데이터와 left 데이터를 교체
			} else {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
			}
		}
		quickSort(arr, start, right - 1);
		quickSort(arr, right + 1, end);
	}
}

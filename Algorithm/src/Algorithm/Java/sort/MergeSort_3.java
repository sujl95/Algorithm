package Algorithm.Java.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSort_3 {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 6, 2, 4, 9, 7};
		int start = 0;
		int end = arr.length - 1;
		System.out.println("arr = " + Arrays.toString(arr));
		partition(arr, start , end);
		System.out.println("arr = " + Arrays.toString(arr));
		
	}

	private static void partition(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			partition(arr, start, mid);
			partition(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int left = start;
		int right = mid + 1;
		int index = start;
		int[] temp = new int[arr.length];
		while (start <= mid && right <= end) {
			if (arr[start] <= arr[right]) {
				temp[index++] = arr[start++];
			} else {
				temp[index++] = arr[right++];
			}
		}
		while (start <= mid) {
			temp[index++] = arr[start++];
		}
		while (right <= end) {
			temp[index++] = arr[right++];
		}
		IntStream.range(left, right).forEach(i -> arr[i] = temp[i]);
	}

}

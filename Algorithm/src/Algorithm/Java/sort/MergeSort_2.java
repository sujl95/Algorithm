package Algorithm.Java.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSort_2 {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 6, 2, 4, 9, 7};
		System.out.println("arr = " + Arrays.toString(arr));
		int left = 0;
		int right = arr.length - 1;
		partition(arr, left, right);
		System.out.println("arr = " + Arrays.toString(arr));
	}

	private static void partition(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			partition(arr, left, mid);
			partition(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
	private static void merge(int[] arr, int left, int mid, int right) {
		int leftStart = left; // 왼쪽 부분 배열을 관리하는 인덱스
		int rightStart = mid + 1; // 오른쪽 부분 배열을 관리하는 인덱스
		int index = left;
		int[] sorted = new int[arr.length];

		// 왼쪽 부분 배열과 오른쪽 부분 배열을 비교하면서
		// 각각의 원소 중에서 작은 원소가 sorted 배열에 들어간다.
		// 왼쪽 혹은 오른쪽의 부분 배열 중 하나의 배열이라도 모든 원소가 sorted 배열에 들어간다면
		// 아래의 반복문은 조건을 만족하지 하지 않기 때문에 빠져 나온다.
		// sorted 배열에 들어가지 못한 부분 배열은 아래 쪽에서 채워진다.
		while (leftStart <= mid && rightStart <= right) {
			if (arr[leftStart] < arr[rightStart]) {
				sorted[index++] = arr[leftStart++];
			} else {
				sorted[index++] = arr[rightStart++];
			}
		}

		// mid < i 인 순간, i는 왼쪽 부분 배열의 인덱스를 관리하므로
		// 즉, 왼쪽 부분 배열이 sorted 에 모두 채워졌음을 의미한다.
		// 따라서 남아 있는 오른쪽 부분 배열의 값을 일괄 복사한다.
		while (leftStart <= mid) {
			sorted[index++] = arr[leftStart++];
		}
		// mid > i 인 것은 오른쪽 부분 배열이 sorted 배열에 정렬된 상태로 모두 채워졌음을 의미한다.
		// 따라서, 왼쪽 부분 배열은 아직 남아 있는 상태이다.
		// 즉, 남아 있는 왼쪽 부분 배열의 값을 일괄 복사한다.
		while (rightStart <= right) {
			sorted[index++] = arr[rightStart++];
		}
		// sorted 배열에 들어간 부분 배열을 합하여 정렬한 배열은
		// 원본 배열인 a 배열로 다시 복사한다.
		IntStream.rangeClosed(left, right).forEach(i -> arr[i] = sorted[i]);
	}
}

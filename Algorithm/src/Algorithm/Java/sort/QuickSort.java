package Algorithm.Java.sort;

import java.util.Arrays;

public class QuickSort {

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
		// 피벗을 배열의 가운데 위치한 요소로 선정
		int pivot = arr[(left + right) / 2];

		while (left <= right) {
			// 피벗 왼쪽에는 피벗보다 작은 원소들이 위치해야하고, 큰 원소가 있다면 반복문을 나온다
			while (arr[left] < pivot) {
				left++;
			}
			// 피벗 오른쪽에는 피벗보다 큰 원소들이 위치해야하고 , 작은 원소가 있다면 반복문을 나온다.
			while (arr[right] > pivot) {
				right--;
			}
			// left와 right가 역전되지 않고 같은 경우가 아니라면 두 원소의 위치를 교환한다
			// 이를 통해서 피벗 기준으로 왼쪽에는 작은 원소가, 오른쪽에는 큰 원소가 위치하게 된다.
			if (left <= right) {
				if (left != right) {
					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
				}
				left++;
				right--;
			}
		}
		// left와 right가 역전된 이후에 피벗의 왼쪽과 오른쪽에는 정렬되지 않은 부분 배열이 남을 수 있다.
		// 이 경우, 남아 있는 부분 배열에 대해서 퀵 정렬을 수행한다
		if (start < right) {
			quickSort(arr, start, right);
		}
		if (left < end) {
			quickSort(arr, left, end);
		}
	}

}

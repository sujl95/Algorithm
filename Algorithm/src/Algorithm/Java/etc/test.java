package Algorithm.Java.etc;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		int[] arr = {5, 1, 2, 4, 9, 0, 8, 3, 6, 7};
		int min;
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}

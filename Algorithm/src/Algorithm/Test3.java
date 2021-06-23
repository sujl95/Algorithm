package Algorithm;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		int[] arr = {5, 2, 1, 3, 4};
		for (int i = 0; i < arr.length -1; i++) {
			int pos = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[pos]) {
					pos = j;
				}
			}
			int temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
		}

		System.out.println("arr = " + Arrays.toString(arr));

	}
}

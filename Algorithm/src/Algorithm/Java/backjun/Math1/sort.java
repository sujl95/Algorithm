package Algorithm.Java.backjun.Math1;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		int[] arr = {5,1,3,2,4};
		int temp;
		for(int i= 0; i < arr.length; i++) {
			for(int j = i+1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

package Algorithm.Java.backjun;

import java.util.*;
public class J1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1 = sc.next();
		String[] arr = str.split("");
		StringBuilder result = new StringBuilder();
		String[] arr1 = str1.split("");
		StringBuilder result1 = new StringBuilder();
		int result2 = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			result.append(arr[i]);
		}
		for (int i = arr1.length - 1; i >= 0; i--) {
			result1.append(arr1[i]);
		}
		if (Integer.parseInt(result.toString()) > Integer.parseInt(result1.toString())) {
			result2 = Integer.parseInt(result.toString());
		} else if (Integer.parseInt(result.toString()) < Integer.parseInt(result1.toString())) {
			result2 = Integer.parseInt(result1.toString());
		}	
		System.out.println(result2);
		
	}

}

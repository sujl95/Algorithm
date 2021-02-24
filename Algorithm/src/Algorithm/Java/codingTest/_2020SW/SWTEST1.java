package Algorithm.Java.codingTest._2020SW;

import java.util.ArrayList;
import java.util.Scanner;

public class SWTEST1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		int N = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = 3000;
		int max = 0;
		if(N >= arr.length) {
			System.out.println(0);
		} else {
			int cnt = (T/N == T) ? T : T/N+2;
			for (int i = 0; i < cnt; i++) {
				
				if(arr[i] < min) {
					min = arr[i];
				}
				if(arr[i]> max) {
					max = arr[i];
				}
			}
			System.out.println(max - min);
		}
	}
}

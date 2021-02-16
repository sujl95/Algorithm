package Algorism.Java.backjun.Array;

import java.util.Scanner;

public class J4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k = 0; k < T; ++k) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			double avg = sum / N;
			int cnt = 0;
			for (int i : arr) {
				if (i > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f", 100.0 * cnt / arr.length);
			System.out.println("%");
		}
	}
}

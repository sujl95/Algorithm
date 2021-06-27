package Algorithm.Java.backjun.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class J11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int res = 0;
		int t = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt(); 
		}
		Arrays.sort(arr);
		for (int i = 0; i < N; i++) {
			t += arr[i];
			res += t;
		}
		System.out.println(res);
	}
}

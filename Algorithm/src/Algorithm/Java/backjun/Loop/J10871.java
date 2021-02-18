package Algorithm.Java.backjun.Loop;

import java.util.Scanner;

public class J10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		for (int i = 0 ; i < N; i++) {
			int c = sc.nextInt();
			if (c < C) {
				System.out.print(c+" ");
			}
		}
	}
}

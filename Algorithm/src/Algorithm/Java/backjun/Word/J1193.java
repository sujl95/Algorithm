package Algorithm.Java.backjun.word;

import java.util.Scanner;

public class J1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int line = 0;
		int cnt = 0;
		do {
			for (int i = 0; i < line + 1; i++) {
				cnt++;
			}
			line++;
		} while (cnt < n);
		int sum=0;
		for (int i = 0; i < line; i++) {
			sum += i;
		}
		int o = n - sum;
		System.out.println((line % 2 == 0) ? (o + "/" + (line + 1 - o)) : ((line + 1 - o) + "/" + o));
	}
}

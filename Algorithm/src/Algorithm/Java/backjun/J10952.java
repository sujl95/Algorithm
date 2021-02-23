package Algorithm.Java.backjun;

import java.util.Scanner;

public class J10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (0 < A && B < 10) {
				System.out.println(A + B);
			} else if(A == 0 && B == 0) {
				break;
			}
		}
	}

}

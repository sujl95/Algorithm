package Algorithm.Java.backjun;

import java.util.*;
public class J1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (-10000 <= A && B <= 10000) {
			if (A > B) {
				System.out.println(">");
			}
			if (A < B) {
				System.out.println("<");
			}
			if (A == B) {
				System.out.println("==");
			}
		}
	}
}
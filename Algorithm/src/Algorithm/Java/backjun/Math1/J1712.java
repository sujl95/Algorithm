package Algorithm.Java.backjun.Math1;

import java.util.*;
public class J1712 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int T;
		if ((C - B) > 0) {
			T = A / (C - B) + 1;
		} else {
			T = -1;
		}
		System.out.println(T);
	}
}
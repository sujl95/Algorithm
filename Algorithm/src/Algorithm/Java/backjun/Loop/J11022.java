package Algorithm.Java.backjun.Loop;

import java.util.Scanner;

public class J11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i =1 ; i <= N ;  i++) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			System.out.print("Case #"+i+": "+a+" + "+b+" = ");
			System.out.println(a+b );
		}
	}
}

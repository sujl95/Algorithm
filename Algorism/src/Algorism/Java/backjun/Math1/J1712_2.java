package Algorism.Java.backjun.Math1;

import java.util.Scanner;

public class J1712_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 기본값
		int x = (sc.nextInt() - sc.nextInt()) * -1; // 1개당 판매 이익
		System.out.println(x <= 0 ? -1 : (a / x + 1)); // 판매 이익이 0보다 작다면 손익분기점이 존재할 수 없다.
		// 이익이 발생하려면  a / x 보다 커야함. 따라서 + 1
	}

}

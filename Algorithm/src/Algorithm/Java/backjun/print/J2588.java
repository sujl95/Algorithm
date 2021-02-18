package Algorithm.Java.backjun.print;

import java.util.Scanner;

public class J2588 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		for (int j = 2; j >= 0; j--) {
			String str = "";
			str += b.charAt(j);
			System.out.println(Integer.parseInt(a) * Integer.parseInt(str));
		}
		System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
	}

}

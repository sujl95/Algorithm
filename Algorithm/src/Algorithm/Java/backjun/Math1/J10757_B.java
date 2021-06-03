package Algorithm.Java.backjun.math1;

import java.math.BigInteger;
import java.util.Scanner;

public class J10757_B {

	public static void main(String[] args) {
		String[] arr = new Scanner(System.in).nextLine().split(" ");
		BigInteger a = new BigInteger(arr[0]);
		BigInteger b = new BigInteger(arr[1]);
		System.out.println(a.add(b));
	}
}

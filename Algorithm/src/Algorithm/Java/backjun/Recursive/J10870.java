package Algorithm.Java.backjun.recursive;

import java.util.Scanner;

public class J10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(pibo(sc.nextInt()));
	}
	static int pibo(int i) {
		if(i == 0) return 0;
		if(i == 1) return 1;
		return pibo(i-1) + pibo(i-2);
	}
}

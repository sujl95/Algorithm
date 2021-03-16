package Algorithm.Java.backjun.dynamic;

import java.util.Scanner;

public class J2748 {
	static long x[] = new long[91];
	static long pibo(int n) {
		if(n==1) return 1;
		if(n==2) return 1;
		if(x[n] !=0) return x[n] ;
		return x[n] = pibo(n-1) + pibo(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in=sc.nextInt();
		System.out.println(pibo(in));
	}

}

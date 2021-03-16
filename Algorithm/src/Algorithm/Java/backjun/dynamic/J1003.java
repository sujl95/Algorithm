package Algorithm.Java.backjun.dynamic;

import java.util.Scanner;

public class J1003 {
	static int cnt0= 0;
	static int cnt1= 0;
	static int x[] = new int[41];
	static int pibo(int n) {
		if(n==0) {
			cnt0++;
			return 0;
		} else if(n==1) {
			cnt1++;
			return 1;
		} else {
			return pibo(n-1)+pibo(n-2);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for (int i = 0; i < T; i++) {
			int in =sc.nextInt();
			cnt0=0;cnt1=0;
			pibo(in);
			System.out.println(cnt0+" "+cnt1);
		}
	}

}

package Algorithm.Java.backjun.Loop;

import java.util.Scanner;

public class J2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i =1; i <= N; i++) {
			String str = "";
			for(int j =1 ; j <= i; j++) {
				str += "*";
			}
			System.out.println(str);	
			
		}
	}

}

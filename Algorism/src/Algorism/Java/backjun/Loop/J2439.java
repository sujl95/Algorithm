package Loop;

import java.util.Scanner;

public class J2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i =1; i <= N; i++) {
			String str = "";
			for(int j =N ; j > i; j--) {
				str += " ";
			}
			for(int k = 1; k <= i; k++) {
				str += "*";
			}
			System.out.println(str);	
			
		}
	}

}

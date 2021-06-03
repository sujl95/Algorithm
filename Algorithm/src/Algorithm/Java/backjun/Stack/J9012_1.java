package Algorithm.Java.backjun.stack;

import java.util.Scanner;

public class J9012_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			int cnt = 0;
			String s = sc.next();
			for(char c : s.toCharArray()) {
				if(cnt < 0) {
					break;
				}
				if (c =='(') cnt++;
				else cnt--;
			}
			System.out.println(cnt == 0 ? "YES" : "NO");
		}
	}

}

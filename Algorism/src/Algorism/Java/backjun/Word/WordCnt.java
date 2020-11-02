package Algorism.Java.backjun.Word;

import java.util.Scanner;

public class WordCnt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		
		String result = sc.next();
		System.out.println(result);
		int cnt = 0;
		for(int i=0; i < result.length();i++) {
			for(int j=0; j<str.length; j++) {
				for(int k=0;k<str[j].length();k++) {
					if(result.charAt(i) == str[j].charAt(k)) {
						cnt += j+3;
					}
				}
			}
		}
		System.out.println(cnt);
		
	}

}

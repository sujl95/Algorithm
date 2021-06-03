package Algorithm.Java.backjun.word;

import java.util.Scanner;

public class J1157_1 {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		String s = r.nextLine();
		int[] a =new int[26];
		for (int i=0; i<s.length(); i++) {
			int x = Character.toLowerCase(s.charAt(i)) - 'a';
			a[x]++;
		}
		
		int m =-1;
		char n = '?';
		for(int i =0; i<26; i++) {
			if(a[i] > m) {
				m = a[i];
				n = (char)(i+65);
			} else if(a[i] == m) {
				n = '?';
			}
		}
		System.out.println(n);
	}

}

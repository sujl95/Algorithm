package Algorithm.Java.backjun.Word;

import java.util.Scanner;

public class J2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		String str1 = str[0];
		String str2 = str[1];
		String res = "";
		String res1 = "";
		for (int i = str1.length()-1; i>=0; i--) {
			res += str1.charAt(i);
		}
		for (int i = str2.length()-1; i>=0; i--) {
			res1 += str2.charAt(i);
		}
		
		System.out.println(Integer.parseInt(res) > Integer.parseInt(res1) ? res : res1);
	}

}

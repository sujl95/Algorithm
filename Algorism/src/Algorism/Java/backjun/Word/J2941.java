package Algorism.Java.backjun.Word;

import java.util.Scanner;

public class J2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		String res = sc.next();
		System.out.println(res.indexOf("s="));
		System.out.println(res.substring(res.indexOf("s="),res.indexOf("s=")+2));

	}

}

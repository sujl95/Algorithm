package Algorithm.Java.backjun.Word;

import java.util.Scanner;

public class J1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim();
		String arr[] = str.split(" ");
		System.out.println((str.isEmpty() == true) ? 0 : arr.length);
	}

}

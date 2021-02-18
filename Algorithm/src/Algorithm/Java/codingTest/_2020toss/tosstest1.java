package Algorithm.Java.codingTest._2020toss;

import java.util.Scanner;

public class tosstest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		boolean ck = true;
		
		if (str.charAt(str.length()-1) == '1') {
			System.out.println(false);
			return;
		}
		for ( int i = 0 ; i< str.length();i++) {
			if(!(str.charAt(i) == '1' || str.charAt(i) == ('2'))) {
				System.out.println(false);
				return;
			}
			if ((i+1) < str.length() && str.charAt(i) == '1' && str.charAt(i + 1) == '1') {
                System.out.println("false");
                return;
            }

		}
		
		
		System.out.println(ck);
	}

}

package Algorithm.Java.backjun.math1;

import java.util.Scanner;

public class J10250_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      for (int i = 0; i < t; i++) {
	         int h = sc.nextInt();
	         int n = sc.nextInt();
	         int num = n/h + 1;
	         int mod = n%h;
	         if( mod == 0 ) {
	            mod = h;
	            num = n/h;
	         }
	         if( num < 10) {
	            System.out.println(mod + "" + "0" + "" + num);
	         } else {            
	            System.out.println(mod + "" + num);
	         }
	      }
	}
}

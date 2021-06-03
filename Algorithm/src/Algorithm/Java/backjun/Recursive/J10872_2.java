package Algorithm.Java.backjun.recursive;

import java.util.*;

public class J10872_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(pac(sc.nextInt()));
	}
	
	static int pac(int i) {
		if(i <= 1) return 1;
		return i * pac(i-1); 
	}

}

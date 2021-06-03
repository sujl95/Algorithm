package Algorithm.Java.backjun.word;

import java.util.Scanner;

public class J2941_1 {

	public static void main(String[] args) {
		System.out.print(new Scanner(System.in).next().replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=","*").length());
	}

}

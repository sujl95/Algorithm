package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2941_S5 {

	public static void main(String[] args) throws IOException {
		System.out.println(new BufferedReader(new InputStreamReader(System.in)).readLine().replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", ".").length());
	}
}

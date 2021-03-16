package Algorithm.Java.backjun.dynamic;

import java.util.Scanner;

public class J11726 {
	static int[] arr = new int[1001]; 
	public static void main(String[] args) {
		System.out.println(tile(new Scanner(System.in).nextInt()));
	}
	static int tile(int i) {
		if(i==1) return 1;
		if(i==2) return 2;
		if(arr[i] != 0) return arr[i];
		
		return arr[i]= (tile(i-1)+tile(i-2))%10007;
	}
}

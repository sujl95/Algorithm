package Algorism.etc;

import java.util.Scanner;

public class tosstest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = sc.nextLine().split(" ");
		boolean ck = true;
		int temp = Integer.parseInt(arr[0]);
		for(int i=0; i<arr.length;i++) {
			if(Integer.parseInt(arr[i])> 0 && Integer.parseInt(arr[i]) <46) {
				
			} else {
				ck = false;
			}
		}
		if(arr.length == 6) {
			for(int i = 1 ; i< arr.length; i++) {
				
				if(temp >= Integer.parseInt(arr[i])) {
					ck = false;
				}
				temp = Integer.parseInt(arr[i]);
			}
		} else {
			ck = false;
		}
		
		System.out.println(ck);
	}

}

package Algorism.Java.codingTest._2020SW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SWTEST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
		//1.값입력 받는다
		//2.배열 0~9선언
		//3.
		
		
		int[] arr = {6,2,5,5,4,5,6,3,7,6};
		ArrayList<String> list = new ArrayList<>();
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] <= N) {
				long max = N;
				String answer = "";
				while(true) {
					if(max<=0) {
						
						break;
					} else {
						
						answer += i ;
						list.add(answer);
						max -= arr[i];
						if(max-arr[i]<0) {
							break;
						}
					}
				}
			}
		}
		long ans =0;
		for(int i=0; i<list.size();i++) {
			if(ans < Long.parseLong(list.get(i))) {
				ans= Long.parseLong(list.get(i));
			}
		}
		System.out.println(ans);
	}
}

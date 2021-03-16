package Algorithm.Java.backjun;

import java.util.Arrays;
import java.util.Scanner;

public class J11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");
		int len =Integer.parseInt(str[0]);
		int money = Integer.parseInt(str[1]);
		int arr[] = new int[len];
		for (int i=0; i < len;i++) {
			arr[i] = sc.nextInt();
		}
		int cnt =0;
		for (int i = len-1; i >= 0 ; i--) {
			if(money == 0) {
				break;
			}
			if(money / arr[i] != 0) {
				cnt += money / arr[i];
				System.out.println(cnt);
				money -= money / arr[i] * arr[i];
				System.out.println(money);
			} 
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(cnt);
	}

}

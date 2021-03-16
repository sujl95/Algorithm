package Algorithm.Java.backjun.If;

import java.util.Scanner;

public class J5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int bur=0;
		int water=0;
		for(int i=0; i<5;i++) {
			arr[i] = sc.nextInt();
			if(i==0) bur=arr[i];
			if(i==3) water=arr[i];
			if(bur> arr[i] && 0<=i && i<=2) bur=arr[i];
			if(water> arr[i] && 3<=i && i<=4) water=arr[i];
		}
		System.out.println(bur+water-50);
	}

}

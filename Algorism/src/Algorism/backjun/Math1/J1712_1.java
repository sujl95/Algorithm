package Algorism.backjun.Math1;

import java.util.Scanner;

public class J1712_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int cnt = 1;
		//A는 고정 B랑 C를 하나팔때마다 cnt++
		//A의 값이 C*cnt값보다 작을때 손익분기점
		//(C-B)*cnt > A
        if(C-B <=0 ) {
            System.out.println(-1); return;
        }
		while (true) {
			if ( A < ((C-B)*cnt)) {
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
		
	}

}

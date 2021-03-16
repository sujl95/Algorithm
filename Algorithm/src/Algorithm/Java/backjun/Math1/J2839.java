package Algorism.Math1;
import java.util.*;

public class J2839 {
	static int func(int N) {
		if ( N < 0) return -999999;
		if(N % 5== 0) return N /5;
		return 1 + (func(N-3)); 
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int cnt = 0;
//		
//		while( N > 0) {
//			if ( N %5 == 0) {
//				cnt += N/5 ; 
//				break;
//			}
//			else {
//				N -= 3 ;
//				cnt++;
//			}
//		}
//		System.out.println(N < 0 ? -1 : cnt);
		int cnt = func(new Scanner(System.in).nextInt());
		System.out.println(cnt < 0 ? -1 : cnt);
	}

}

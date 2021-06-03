package Algorithm.Java.backjun.math1;

import java.util.*;

public class J10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		// 몫+1이 호수
		// 나머지가 층
		for (int i = 0; i < t; i++) {
			int h = sc.nextInt();
			int n = sc.nextInt();
			int mok;
			int nam = n % h;
			String result = "";

			if (nam == 0) {
				nam = h;
				mok = n / h;
				if (mok < 10) {
					result += "" + nam + "0" + mok + "";
				} else {
					result += "" + nam + "" + mok + "";
				}
				System.out.println(result);
			} else {
				if (h < 10) {
					mok = n / h + 1;
					if (mok < 10) {
						result += "" + nam + "0" + mok + "";
					} else {
						result += "" + nam + "" + mok + "";
					}
					System.out.println(result);
				} else {
					mok = n / h + 1;
					nam = n % h;
					if (mok < 10) {
						result += "" + nam + "0" + mok + "";
					} else {
						result += "" + nam + "" + mok + "";
					}
					System.out.println(result);
				}
			}
			
		}
	}

}

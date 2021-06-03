package Algorithm.Java.backjun.loopwhile;
import java.util.*;
public class J1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String nw = str;
		int ans ;
		int cnt = 0;
		boolean ck = true;
		while(ck) {
			if ( nw.length() == 1 ) {
				nw = "0" + nw;
			}
			String a = nw.substring(0, 1);
			String b = nw.substring(1, 2);
			ans = Integer.parseInt(a) + Integer.parseInt(b);
			if (Integer.toString(ans).length() > 1) {
				nw = "" + b + Integer.toString(ans).charAt(1);
			} else {
				nw = "" + b + ans;
			}
			if (Integer.parseInt(nw) < 10) {
				nw = Integer.toString(Integer.parseInt(nw));
			}
			if (str.equals(nw)) {
				ck = false;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}

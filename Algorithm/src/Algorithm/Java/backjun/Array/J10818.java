package Algorithm.Java.backjun.Array;
import java.util.*;
public class J10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//두번째 방법
		int min = 1000000;
		int max = -1000000;
		int n = sc.nextInt();
		while(n-->0) {
			int x = sc.nextInt();
			if (x < min) min =x;
			if(max < x) max = x;
		}
		System.out.println(min + " " + max);
	}
}

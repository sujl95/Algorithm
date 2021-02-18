package Algorithm.Java.backjun.Array;
import java.util.*;
public class J8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for(int i =0; i< N ; i++) {
			arr[i]  = sc.next();
			String[] arr1 = arr[i].split("");
			int cnt = 0;
			int sum =0;
			for (String s : arr1) {
				if (s.equals("O")) {
					sum += ++cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
	}
}

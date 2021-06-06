package Algorithm.Java.backjun.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J1120_S4 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		String A = str[0];
		String B = str[1];
		int answer = A.length();
		for (int i = 0; i < B.length() - A.length() + 1; i++) {
			int cnt = 0;
			for (int j = 0; j < A.length(); j++) {
				if (A.charAt(j) != B.charAt(i + j)) {
					cnt++;
				}
			}
			answer = Math.min(cnt, answer);
		}
		System.out.println(answer);
	}

}

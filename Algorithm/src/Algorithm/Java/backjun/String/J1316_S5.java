package Algorithm.Java.backjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1316_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			if (check(str)) {
				result++;
			}
		}
		System.out.println(result);
	}

	private static boolean check(String str) {
		boolean[] check = new boolean[26];
		int temp = 0;
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			if (temp != now) {
				if (!check[now - 'a']) {
					check[now - 'a'] = true;
					temp = now;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
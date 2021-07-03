package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1748_S3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int N = Integer.parseInt(input);
		int count = 1;
		int res = 0;
		int length = 10;
		for (int i = 1; i <= N; i++) {
			if (i == length) {
				count++;
				length *= 10;
			}
			res += count;
		}
		System.out.println(res);
	}
}

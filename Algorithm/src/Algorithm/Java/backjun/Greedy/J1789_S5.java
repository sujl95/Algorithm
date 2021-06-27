package Algorithm.Java.backjun.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1789_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		long sum = 0;
		long res = 0;
		while (N >= sum) {
			sum += ++res;
		}
		if (sum != N) {
			res -= 1;
		}
		System.out.println(res);
	}

}

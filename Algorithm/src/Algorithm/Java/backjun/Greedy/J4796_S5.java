package Algorithm.Java.backjun.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J4796_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		while(true) {
			String input = br.readLine().trim();
			if (input.equals("0 0 0")) {
				break;
			}
			int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
			int L = arr[0];
			int P = arr[1];
			int V = arr[2];
			int res = (V / P * L) + Math.min(V % P, L);
			System.out.println("Case " + ++count + ": " + res);
		}
	}
}

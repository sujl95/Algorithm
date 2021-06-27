package Algorithm.Java.backjun.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J11047_S2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = input[0];
		int K = input[1];

		int res = 0;

		int[] coin = new int[N];

		for (int i = 0; i < coin.length; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}

		for (int i = coin.length - 1; i >= 0; i--) {
			if (K == 0) {
				break;
			}
			int value = K / coin[i];
			if (value != 0) {
				K -= coin[i] * value;
				res += value;
			}
		}
		System.out.println(res);
	}
}

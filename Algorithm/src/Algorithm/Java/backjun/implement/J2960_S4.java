package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J2960_S4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = input[0];
		int K = input[1];
		boolean[] arr = new boolean[N + 1];
		int res = 0;
		for (int i = 2; i <= N; i++) {
			for (int j = i; j <= N; j += i) {
				if (!arr[j]) {
					res++;
					arr[j] = true;
				}
				if (res == K) {
					System.out.println(j);
					return;
				}
			}
		}
	}
}

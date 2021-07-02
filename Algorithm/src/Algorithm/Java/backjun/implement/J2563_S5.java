package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J2563_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean[][] arr = new boolean[101][101];
		for (int i = 0; i < N; i++) {
			int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int x = input[0];
			int y = input[1];
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					arr[x + j][y + k] = true;
				}
			}
		}
		int res = 0;
		for (boolean[] booleans : arr) {
			for (int j = 0; j < arr.length; j++) {
				if (booleans[j]) {
					res++;
				}
			}
		}
		System.out.println(res);
	}

}

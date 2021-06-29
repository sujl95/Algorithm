package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J7568_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][];
		for (int i = 0; i < N; i++) {
			arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		for (int i = 0; i < N; i++) {
			int res = 1;
			int w = arr[i][0];
			int h = arr[i][1];
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				int nextW = arr[j][0];
				int nextH = arr[j][1];
				if (w < nextW && h < nextH) {
					res++;
				}
			}
			System.out.print(res+" ");
		}


	}

}

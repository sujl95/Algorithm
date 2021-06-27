package Algorithm.Java.backjun.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class J1946_S1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][2];
			for (int j = 0; j < N; j++) {
				arr[j] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			}
			Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
			int res = N;
			int max = arr[0][1];
			for (int j = 1; j < N; j++) {
				int value = arr[j][1];
				if (max < value) {
					res--;
				}
				if (max > value) {
					max = value;
				}
			}
			System.out.println(res);
		}
	}
}

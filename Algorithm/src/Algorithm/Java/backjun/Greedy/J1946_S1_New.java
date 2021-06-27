package Algorithm.Java.backjun.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J1946_S1_New {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			for (int j = 0; j < N; j++) {
				int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				arr[input[0] - 1] = input[1];
			}
			int res = N;
			int max = arr[0];
			for (int j = 1; j < N; j++) {
				int value = arr[j];
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

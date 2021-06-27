package Algorithm.Java.backjun.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J1931_S2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		Arrays.sort(arr, (start, end) ->
				start[1] == end[1] ? Integer.compare(start[0], end[0]) : Integer.compare(start[1], end[1]));
		int res = 0;
		int end = -1;
		for (int i = 0; i < N; i++) {
			if (arr[i][0] >= end) {
				end = arr[i][1];
				res++;
			}
		}
		System.out.println(res);
	}
}

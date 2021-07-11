package Algorithm.Java.backjun.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class J1026_S4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[2][N];
		for (int i = 0; i < 2; i++) {
			arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(arr[i]);
		}
		System.out.println(IntStream.range(0, N).map(i -> arr[0][i] * arr[1][N - 1 - i]).sum());
	}
}

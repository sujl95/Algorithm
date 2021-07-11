package Algorithm.Java.backjun.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class J10814_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][2];
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine().split(" ");
		}

		Arrays.sort(arr, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}

}
